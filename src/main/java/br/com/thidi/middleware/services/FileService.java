package br.com.thidi.middleware.services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

import br.com.thidi.middleware.resource.CLogger;

public class FileService {

	public static void checkOrCreateFile(Path filePath, String fileContent) {
		if (!Files.exists(filePath)) {
			try {
				Files.createFile(filePath);
				Files.write(filePath, Arrays.asList(fileContent));
				CLogger.logFileInfo("File Service", fileContent);
			} catch (IOException e) {
				CLogger.logFileInfo("File Service", "Error creating file created at: " + filePath);
			}
		}
	}

}
