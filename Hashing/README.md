String we want to hash - AtulIsGod with algo  - SHA-256

covert the original array into byte array using UTF_8 format - StandardCharsets.UTF_8

byte array of string  - [B@50040f0c

create a digest that will take this byte array as input

create byte array of encodeHash from the above byte array

encodedHash - [B@7eda2dbb

to convert this byte array to a readable hexadecimal string. created function - bytesToHex takes this encodedHash as input

for SHA-256 - hashedString 92da88dadf8c8a5265b36d57fadd10ea50227463477292f8b2a184d469dac2ed

for MD5 - hashedString d00f0ebeb54dc936549f650db6467fa4



