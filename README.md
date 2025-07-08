# Reverse-Malicious-.jar

This repository stores scripts used to reverse and deobfuscate Java-based malware, along with the full deobfuscated source code output for malware analysis write up:
https://hareezishraf5.github.io/blog/GametoGain/

Sample: https://www.virustotal.com/gui/file/982e47f604b9b5cbb710f9d6bad16a3e44b0122c44dede726729b843ba357414

1. Complete_DeobfuscatedVersion_FileDownloader.txt
   This is full version of deobsfucation from the FileDownloader.class.

2. Complete_DeobfuscatedVersion_RSPS.txt
   This is full version of deobsfucation from the RSPS.class.

3. FileDownloaderDecryptor.java
   This is Java script to deobfuscate the encrypted strings from FileDownloader.class. Please run `javac FileDownloaderDecryptor.java` to compile and run `java FileDownloaderDecryptor` to run and get the output.

4. RSPSDecryptor.java
   This is Java script to deobfuscate the encrypted strings from RSPSDecryptor.class. Please run `javac RSPSDecryptor.java` to compile and run `java RSPSDecryptor` to run and get the output.
