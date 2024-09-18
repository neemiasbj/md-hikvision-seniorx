package br.com.thidi.middleware.utils;

import java.util.UUID;

import org.apache.commons.codec.digest.DigestUtils;

public class DigestAuthUtils {

	public static String calculateDigest(String username, String realm, String password, String method, String uri, String nonce, String nc, String cnonce, String qop) {
		String A1 = username + ":" + realm + ":" + password;
		String ha1 = DigestUtils.md5Hex(A1);

		String A2 = method + ":" + uri;
		String ha2 = DigestUtils.md5Hex(A2);

		return DigestUtils.md5Hex(ha1 + ":" + nonce + ":" + nc + ":" + cnonce + ":" + qop + ":" + ha2);
	}

	public static String generateCnonce() {
		return UUID.randomUUID().toString();
	}
}
