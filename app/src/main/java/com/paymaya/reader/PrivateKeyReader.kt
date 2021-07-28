package com.paymaya.reader

import java.nio.file.Files
import java.nio.file.Paths

/**
 * Reads a Private Key from a pem encoded file.
 * @param filename name of the file to read.
 * @return returns the privatekey which is read from the file;
 */
class PrivateKeyReader {
    fun getPrivateKey(path: String): String {
        val keyBytes: ByteArray = Files.readAllBytes(Paths.get("$path/bryan-android.private.key"))
        return keyBytes.toString()
    }
}
