package br.com.hikvision.services;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;

import br.com.hikvision.minmoe.models.EmployeeCard;

public class HikvisionEmployeeCardManager {
	private static ArrayList<EmployeeCard> employeeCards = new ArrayList<>();;

	public HikvisionEmployeeCardManager() {
		startCleanerTask();
	}

	public static void addEmployeeCard(EmployeeCard employeeCard) {
		employeeCards.add(employeeCard);
	}

	public static void main(String[] args) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();

		Duration duration = Duration
				.between(LocalDateTime.parse("2024-10-08T22:19:00+03:00".substring(0, 19), formatter), now);

		System.out.println(duration.getSeconds());
	}

	public static boolean hasRegisterByCardIdUnderFiveSeconds(EmployeeCard employeeCard) {
		LocalDateTime now = LocalDateTime.now();
		Iterator<EmployeeCard> iterator = employeeCards.iterator();

		displayEmployeeCards();

		while (iterator.hasNext()) {
			EmployeeCard card = iterator.next();
			Duration duration = Duration.between(card.getDateTime(), now);

			if (card.getCardId() != null && card.getCardId().equals(employeeCard.getCardId())) {
				if (duration.getSeconds() > 5) {
					System.out.println("DURATION > 5: " + duration.getSeconds());
					iterator.remove();
					addEmployeeCard(employeeCard);
					return false;
				} else {
					System.out.println("DURATION <= 5: " + duration.getSeconds());
					return true;
				}
			}
		}
		addEmployeeCard(employeeCard);
		return false;
	}

	public static boolean hasRegisterByEmployeeIdUnderFiveSeconds(EmployeeCard employeeCard) {
		LocalDateTime now = LocalDateTime.now();
		Iterator<EmployeeCard> iterator = employeeCards.iterator();

		displayEmployeeCards();

		while (iterator.hasNext()) {
			EmployeeCard card = iterator.next();
			Duration duration = Duration.between(card.getDateTime(), now);

			if (card.getEmployeeId() != null && card.getEmployeeId().equals(employeeCard.getEmployeeId())) {
				if (duration.getSeconds() > 5) {
					System.out.println("DURATION > 5: " + duration.getSeconds());
					iterator.remove();
					addEmployeeCard(employeeCard);
					return false;
				} else {
					System.out.println("DURATION <= 5: " + duration.getSeconds());
					return true;
				}
			}
		}
		addEmployeeCard(employeeCard);
		return false;
	}

	private void cleanOldCards() {
		LocalDateTime now = LocalDateTime.now();
		Iterator<EmployeeCard> iterator = employeeCards.iterator();

		while (iterator.hasNext()) {
			EmployeeCard card = iterator.next();
			Duration duration = Duration.between(card.getDateTime(), now);
			if (duration.getSeconds() > 5)
				iterator.remove();
		}
	}

	private void startCleanerTask() {
		Runnable cleanerTask = () -> {
			while (true) {
				try {
					Thread.sleep(30000);
					cleanOldCards();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		Thread cleanerThread = new Thread(cleanerTask);
		cleanerThread.setDaemon(true);
		cleanerThread.start();
	}

	public static void displayEmployeeCards() {
		if (employeeCards.isEmpty()) {
			System.out.println("No Employee Cards in the list.");
		} else {
			for (EmployeeCard card : employeeCards) {
				System.out.println(card);
			}
		}
	}

}
