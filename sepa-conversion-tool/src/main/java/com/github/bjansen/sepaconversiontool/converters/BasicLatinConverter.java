package com.github.bjansen.sepaconversiontool.converters;

class BasicLatinConverter extends SepaCharacterConverter {
  private static final String[] REPLACEMENTS = new String[8365];

  static {
    REPLACEMENTS[0x0021] = ".";
    REPLACEMENTS[0x0023] = ".";
    REPLACEMENTS[0x0024] = ".";
    REPLACEMENTS[0x0025] = ".";
    REPLACEMENTS[0x002a] = ".";
    REPLACEMENTS[0x003b] = ",";
    REPLACEMENTS[0x003c] = ".";
    REPLACEMENTS[0x003d] = ".";
    REPLACEMENTS[0x003e] = ".";
    REPLACEMENTS[0x0040] = ".";
    REPLACEMENTS[0x005b] = "(";
    REPLACEMENTS[0x005c] = "/";
    REPLACEMENTS[0x005d] = ")";
    REPLACEMENTS[0x005e] = ".";
    REPLACEMENTS[0x005f] = "-";
    REPLACEMENTS[0x0060] = "'";
    REPLACEMENTS[0x007b] = "(";
    REPLACEMENTS[0x007c] = "/";
    REPLACEMENTS[0x007d] = ")";
    REPLACEMENTS[0x007e] = "-";
    REPLACEMENTS[0x007f] = ".";
    REPLACEMENTS[0x0080] = ".";
    REPLACEMENTS[0x0081] = ".";
    REPLACEMENTS[0x0082] = ".";
    REPLACEMENTS[0x0083] = ".";
    REPLACEMENTS[0x0084] = ".";
    REPLACEMENTS[0x0085] = ".";
    REPLACEMENTS[0x0086] = ".";
    REPLACEMENTS[0x0087] = ".";
    REPLACEMENTS[0x0088] = ".";
    REPLACEMENTS[0x0089] = ".";
    REPLACEMENTS[0x008a] = ".";
    REPLACEMENTS[0x008b] = ".";
    REPLACEMENTS[0x008c] = ".";
    REPLACEMENTS[0x008d] = ".";
    REPLACEMENTS[0x008e] = ".";
    REPLACEMENTS[0x008f] = ".";
    REPLACEMENTS[0x0090] = ".";
    REPLACEMENTS[0x0091] = ".";
    REPLACEMENTS[0x0092] = ".";
    REPLACEMENTS[0x0093] = ".";
    REPLACEMENTS[0x0094] = ".";
    REPLACEMENTS[0x0095] = ".";
    REPLACEMENTS[0x0096] = ".";
    REPLACEMENTS[0x0097] = ".";
    REPLACEMENTS[0x0098] = ".";
    REPLACEMENTS[0x0099] = ".";
    REPLACEMENTS[0x009a] = ".";
    REPLACEMENTS[0x009b] = ".";
    REPLACEMENTS[0x009c] = ".";
    REPLACEMENTS[0x009d] = ".";
    REPLACEMENTS[0x009e] = ".";
    REPLACEMENTS[0x009f] = ".";
    REPLACEMENTS[0x00a0] = " ";
    REPLACEMENTS[0x00a1] = ".";
    REPLACEMENTS[0x00a2] = ".";
    REPLACEMENTS[0x00a3] = ".";
    REPLACEMENTS[0x00a4] = ".";
    REPLACEMENTS[0x00a5] = ".";
    REPLACEMENTS[0x00a6] = ".";
    REPLACEMENTS[0x00a7] = ".";
    REPLACEMENTS[0x00a8] = ".";
    REPLACEMENTS[0x00a9] = ".";
    REPLACEMENTS[0x00aa] = ".";
    REPLACEMENTS[0x00ab] = ".";
    REPLACEMENTS[0x00ac] = ".";
    REPLACEMENTS[0x00ad] = ".";
    REPLACEMENTS[0x00ae] = ".";
    REPLACEMENTS[0x00af] = ".";
    REPLACEMENTS[0x00b0] = ".";
    REPLACEMENTS[0x00b1] = ".";
    REPLACEMENTS[0x00b2] = ".";
    REPLACEMENTS[0x00b3] = ".";
    REPLACEMENTS[0x00b4] = ".";
    REPLACEMENTS[0x00b5] = ".";
    REPLACEMENTS[0x00b6] = ".";
    REPLACEMENTS[0x00b7] = ".";
    REPLACEMENTS[0x00b8] = ".";
    REPLACEMENTS[0x00b9] = ".";
    REPLACEMENTS[0x00ba] = ".";
    REPLACEMENTS[0x00bb] = ".";
    REPLACEMENTS[0x00bc] = ".";
    REPLACEMENTS[0x00bd] = ".";
    REPLACEMENTS[0x00be] = ".";
    REPLACEMENTS[0x00bf] = "?";
    REPLACEMENTS[0x00c0] = "A";
    REPLACEMENTS[0x00c1] = "A";
    REPLACEMENTS[0x00c2] = "A";
    REPLACEMENTS[0x00c3] = "A";
    REPLACEMENTS[0x00c4] = "A";
    REPLACEMENTS[0x00c5] = "A";
    REPLACEMENTS[0x00c6] = "A";
    REPLACEMENTS[0x00c7] = "C";
    REPLACEMENTS[0x00c8] = "E";
    REPLACEMENTS[0x00c9] = "E";
    REPLACEMENTS[0x00ca] = "E";
    REPLACEMENTS[0x00cb] = "E";
    REPLACEMENTS[0x00cc] = "I";
    REPLACEMENTS[0x00cd] = "I";
    REPLACEMENTS[0x00ce] = "I";
    REPLACEMENTS[0x00cf] = "I";
    REPLACEMENTS[0x00d0] = ".";
    REPLACEMENTS[0x00d1] = "N";
    REPLACEMENTS[0x00d2] = "O";
    REPLACEMENTS[0x00d3] = "O";
    REPLACEMENTS[0x00d4] = "O";
    REPLACEMENTS[0x00d5] = "O";
    REPLACEMENTS[0x00d6] = "O";
    REPLACEMENTS[0x00d7] = ".";
    REPLACEMENTS[0x00d8] = "O";
    REPLACEMENTS[0x00d9] = "U";
    REPLACEMENTS[0x00da] = "U";
    REPLACEMENTS[0x00db] = "U";
    REPLACEMENTS[0x00dc] = "U";
    REPLACEMENTS[0x00dd] = "Y";
    REPLACEMENTS[0x00de] = "b";
    REPLACEMENTS[0x00df] = "s";
    REPLACEMENTS[0x00e0] = "a";
    REPLACEMENTS[0x00e1] = "a";
    REPLACEMENTS[0x00e2] = "a";
    REPLACEMENTS[0x00e3] = "a";
    REPLACEMENTS[0x00e4] = "a";
    REPLACEMENTS[0x00e5] = "a";
    REPLACEMENTS[0x00e6] = "a";
    REPLACEMENTS[0x00e7] = "c";
    REPLACEMENTS[0x00e8] = "e";
    REPLACEMENTS[0x00e9] = "e";
    REPLACEMENTS[0x00ea] = "e";
    REPLACEMENTS[0x00eb] = "e";
    REPLACEMENTS[0x00ec] = "i";
    REPLACEMENTS[0x00ed] = "i";
    REPLACEMENTS[0x00ee] = "i";
    REPLACEMENTS[0x00ef] = "i";
    REPLACEMENTS[0x00f0] = ".";
    REPLACEMENTS[0x00f1] = "n";
    REPLACEMENTS[0x00f2] = "o";
    REPLACEMENTS[0x00f3] = "o";
    REPLACEMENTS[0x00f4] = "o";
    REPLACEMENTS[0x00f5] = "o";
    REPLACEMENTS[0x00f6] = "o";
    REPLACEMENTS[0x00f7] = ".";
    REPLACEMENTS[0x00f8] = "o";
    REPLACEMENTS[0x00f9] = "u";
    REPLACEMENTS[0x00fa] = "u";
    REPLACEMENTS[0x00fb] = "u";
    REPLACEMENTS[0x00fc] = "u";
    REPLACEMENTS[0x00fd] = "y";
    REPLACEMENTS[0x00fe] = "p";
    REPLACEMENTS[0x00ff] = "y";
    REPLACEMENTS[0x0100] = "A";
    REPLACEMENTS[0x0101] = "a";
    REPLACEMENTS[0x0102] = "A";
    REPLACEMENTS[0x0103] = "a";
    REPLACEMENTS[0x0104] = "A";
    REPLACEMENTS[0x0105] = "a";
    REPLACEMENTS[0x0106] = "C";
    REPLACEMENTS[0x0107] = "c";
    REPLACEMENTS[0x0108] = "C";
    REPLACEMENTS[0x0109] = "c";
    REPLACEMENTS[0x010a] = "C";
    REPLACEMENTS[0x010b] = "c";
    REPLACEMENTS[0x010c] = "C";
    REPLACEMENTS[0x010d] = "c";
    REPLACEMENTS[0x010e] = "D";
    REPLACEMENTS[0x010f] = "d";
    REPLACEMENTS[0x0110] = "D";
    REPLACEMENTS[0x0111] = "d";
    REPLACEMENTS[0x0112] = "E";
    REPLACEMENTS[0x0113] = "e";
    REPLACEMENTS[0x0114] = "E";
    REPLACEMENTS[0x0115] = "e";
    REPLACEMENTS[0x0116] = "E";
    REPLACEMENTS[0x0117] = "e";
    REPLACEMENTS[0x0118] = "E";
    REPLACEMENTS[0x0119] = "e";
    REPLACEMENTS[0x011a] = "E";
    REPLACEMENTS[0x011b] = "e";
    REPLACEMENTS[0x011c] = "G";
    REPLACEMENTS[0x011d] = "g";
    REPLACEMENTS[0x011e] = "G";
    REPLACEMENTS[0x011f] = "g";
    REPLACEMENTS[0x0120] = "G";
    REPLACEMENTS[0x0121] = "g";
    REPLACEMENTS[0x0122] = "G";
    REPLACEMENTS[0x0123] = "g";
    REPLACEMENTS[0x0124] = "H";
    REPLACEMENTS[0x0125] = "i";
    REPLACEMENTS[0x0126] = "H";
    REPLACEMENTS[0x0127] = "i";
    REPLACEMENTS[0x0128] = "I";
    REPLACEMENTS[0x0129] = "i";
    REPLACEMENTS[0x012a] = "I";
    REPLACEMENTS[0x012b] = "i";
    REPLACEMENTS[0x012c] = "I";
    REPLACEMENTS[0x012d] = "i";
    REPLACEMENTS[0x012e] = "I";
    REPLACEMENTS[0x012f] = "i";
    REPLACEMENTS[0x0130] = "I";
    REPLACEMENTS[0x0131] = "i";
    REPLACEMENTS[0x0132] = "I";
    REPLACEMENTS[0x0133] = "i";
    REPLACEMENTS[0x0134] = "J";
    REPLACEMENTS[0x0135] = "j";
    REPLACEMENTS[0x0136] = "K";
    REPLACEMENTS[0x0137] = "k";
    REPLACEMENTS[0x0138] = ".";
    REPLACEMENTS[0x0139] = "L";
    REPLACEMENTS[0x013a] = "l";
    REPLACEMENTS[0x013b] = "L";
    REPLACEMENTS[0x013c] = "l";
    REPLACEMENTS[0x013d] = "L";
    REPLACEMENTS[0x013e] = "l";
    REPLACEMENTS[0x013f] = "L";
    REPLACEMENTS[0x0140] = "l";
    REPLACEMENTS[0x0141] = "L";
    REPLACEMENTS[0x0142] = "l";
    REPLACEMENTS[0x0143] = "N";
    REPLACEMENTS[0x0144] = "n";
    REPLACEMENTS[0x0145] = "N";
    REPLACEMENTS[0x0146] = "n";
    REPLACEMENTS[0x0147] = "N";
    REPLACEMENTS[0x0148] = "n";
    REPLACEMENTS[0x0149] = ".";
    REPLACEMENTS[0x014a] = ".";
    REPLACEMENTS[0x014b] = ".";
    REPLACEMENTS[0x014c] = ".";
    REPLACEMENTS[0x014d] = ".";
    REPLACEMENTS[0x014e] = ".";
    REPLACEMENTS[0x014f] = ".";
    REPLACEMENTS[0x0150] = "O";
    REPLACEMENTS[0x0151] = "o";
    REPLACEMENTS[0x0152] = "O";
    REPLACEMENTS[0x0153] = "o";
    REPLACEMENTS[0x0154] = "R";
    REPLACEMENTS[0x0155] = "r";
    REPLACEMENTS[0x0156] = "R";
    REPLACEMENTS[0x0157] = "r";
    REPLACEMENTS[0x0158] = "R";
    REPLACEMENTS[0x0159] = "r";
    REPLACEMENTS[0x015a] = "S";
    REPLACEMENTS[0x015b] = "s";
    REPLACEMENTS[0x015c] = "S";
    REPLACEMENTS[0x015d] = "s";
    REPLACEMENTS[0x015e] = "S";
    REPLACEMENTS[0x015f] = "s";
    REPLACEMENTS[0x0160] = "S";
    REPLACEMENTS[0x0161] = "s";
    REPLACEMENTS[0x0162] = "T";
    REPLACEMENTS[0x0163] = "t";
    REPLACEMENTS[0x0164] = "T";
    REPLACEMENTS[0x0165] = "t";
    REPLACEMENTS[0x0166] = "T";
    REPLACEMENTS[0x0167] = "t";
    REPLACEMENTS[0x0168] = "U";
    REPLACEMENTS[0x0169] = "u";
    REPLACEMENTS[0x016a] = "U";
    REPLACEMENTS[0x016b] = "u";
    REPLACEMENTS[0x016c] = "U";
    REPLACEMENTS[0x016d] = "u";
    REPLACEMENTS[0x016e] = "U";
    REPLACEMENTS[0x016f] = "u";
    REPLACEMENTS[0x0170] = "U";
    REPLACEMENTS[0x0171] = "u";
    REPLACEMENTS[0x0172] = "U";
    REPLACEMENTS[0x0173] = "u";
    REPLACEMENTS[0x0174] = "W";
    REPLACEMENTS[0x0175] = "w";
    REPLACEMENTS[0x0176] = "Y";
    REPLACEMENTS[0x0177] = "y";
    REPLACEMENTS[0x0178] = "Y";
    REPLACEMENTS[0x0179] = "Z";
    REPLACEMENTS[0x017a] = "z";
    REPLACEMENTS[0x017b] = "Z";
    REPLACEMENTS[0x017c] = "z";
    REPLACEMENTS[0x017d] = "Z";
    REPLACEMENTS[0x017e] = "z";
    REPLACEMENTS[0x017f] = ".";
    REPLACEMENTS[0x0180] = ".";
    REPLACEMENTS[0x0181] = ".";
    REPLACEMENTS[0x0182] = ".";
    REPLACEMENTS[0x0183] = ".";
    REPLACEMENTS[0x0184] = ".";
    REPLACEMENTS[0x0185] = ".";
    REPLACEMENTS[0x0186] = ".";
    REPLACEMENTS[0x0187] = ".";
    REPLACEMENTS[0x0188] = ".";
    REPLACEMENTS[0x0189] = ".";
    REPLACEMENTS[0x018a] = ".";
    REPLACEMENTS[0x018b] = ".";
    REPLACEMENTS[0x018c] = ".";
    REPLACEMENTS[0x018d] = ".";
    REPLACEMENTS[0x018e] = ".";
    REPLACEMENTS[0x018f] = ".";
    REPLACEMENTS[0x0190] = ".";
    REPLACEMENTS[0x0191] = ".";
    REPLACEMENTS[0x0192] = ".";
    REPLACEMENTS[0x0193] = ".";
    REPLACEMENTS[0x0194] = ".";
    REPLACEMENTS[0x0195] = ".";
    REPLACEMENTS[0x0196] = ".";
    REPLACEMENTS[0x0197] = ".";
    REPLACEMENTS[0x0198] = ".";
    REPLACEMENTS[0x0199] = ".";
    REPLACEMENTS[0x019a] = ".";
    REPLACEMENTS[0x019b] = ".";
    REPLACEMENTS[0x019c] = ".";
    REPLACEMENTS[0x019d] = ".";
    REPLACEMENTS[0x019e] = ".";
    REPLACEMENTS[0x019f] = ".";
    REPLACEMENTS[0x01a0] = ".";
    REPLACEMENTS[0x01a1] = ".";
    REPLACEMENTS[0x01a2] = ".";
    REPLACEMENTS[0x01a3] = ".";
    REPLACEMENTS[0x01a4] = ".";
    REPLACEMENTS[0x01a5] = ".";
    REPLACEMENTS[0x01a6] = ".";
    REPLACEMENTS[0x01a7] = ".";
    REPLACEMENTS[0x01a8] = ".";
    REPLACEMENTS[0x01a9] = ".";
    REPLACEMENTS[0x01aa] = ".";
    REPLACEMENTS[0x01ab] = ".";
    REPLACEMENTS[0x01ac] = ".";
    REPLACEMENTS[0x01ad] = ".";
    REPLACEMENTS[0x01ae] = ".";
    REPLACEMENTS[0x01af] = ".";
    REPLACEMENTS[0x01b0] = ".";
    REPLACEMENTS[0x01b1] = ".";
    REPLACEMENTS[0x01b2] = ".";
    REPLACEMENTS[0x01b3] = ".";
    REPLACEMENTS[0x01b4] = ".";
    REPLACEMENTS[0x01b5] = ".";
    REPLACEMENTS[0x01b6] = ".";
    REPLACEMENTS[0x01b7] = ".";
    REPLACEMENTS[0x01b8] = ".";
    REPLACEMENTS[0x01b9] = ".";
    REPLACEMENTS[0x01ba] = ".";
    REPLACEMENTS[0x01bb] = ".";
    REPLACEMENTS[0x01bc] = ".";
    REPLACEMENTS[0x01bd] = ".";
    REPLACEMENTS[0x01be] = ".";
    REPLACEMENTS[0x01bf] = ".";
    REPLACEMENTS[0x01c0] = ".";
    REPLACEMENTS[0x01c1] = ".";
    REPLACEMENTS[0x01c2] = ".";
    REPLACEMENTS[0x01c3] = ".";
    REPLACEMENTS[0x01c4] = ".";
    REPLACEMENTS[0x01c5] = ".";
    REPLACEMENTS[0x01c6] = ".";
    REPLACEMENTS[0x01c7] = ".";
    REPLACEMENTS[0x01c8] = ".";
    REPLACEMENTS[0x01c9] = ".";
    REPLACEMENTS[0x01ca] = ".";
    REPLACEMENTS[0x01cb] = ".";
    REPLACEMENTS[0x01cc] = ".";
    REPLACEMENTS[0x01cd] = ".";
    REPLACEMENTS[0x01ce] = ".";
    REPLACEMENTS[0x01cf] = ".";
    REPLACEMENTS[0x01d0] = ".";
    REPLACEMENTS[0x01d1] = ".";
    REPLACEMENTS[0x01d2] = ".";
    REPLACEMENTS[0x01d3] = ".";
    REPLACEMENTS[0x01d4] = ".";
    REPLACEMENTS[0x01d5] = ".";
    REPLACEMENTS[0x01d6] = ".";
    REPLACEMENTS[0x01d7] = ".";
    REPLACEMENTS[0x01d8] = ".";
    REPLACEMENTS[0x01d9] = ".";
    REPLACEMENTS[0x01da] = ".";
    REPLACEMENTS[0x01db] = ".";
    REPLACEMENTS[0x01dc] = ".";
    REPLACEMENTS[0x01dd] = ".";
    REPLACEMENTS[0x01de] = ".";
    REPLACEMENTS[0x01df] = ".";
    REPLACEMENTS[0x01e0] = ".";
    REPLACEMENTS[0x01e1] = ".";
    REPLACEMENTS[0x01e2] = ".";
    REPLACEMENTS[0x01e3] = ".";
    REPLACEMENTS[0x01e4] = ".";
    REPLACEMENTS[0x01e5] = ".";
    REPLACEMENTS[0x01e6] = ".";
    REPLACEMENTS[0x01e7] = ".";
    REPLACEMENTS[0x01e8] = ".";
    REPLACEMENTS[0x01e9] = ".";
    REPLACEMENTS[0x01ea] = ".";
    REPLACEMENTS[0x01eb] = ".";
    REPLACEMENTS[0x01ec] = ".";
    REPLACEMENTS[0x01ed] = ".";
    REPLACEMENTS[0x01ee] = ".";
    REPLACEMENTS[0x01ef] = ".";
    REPLACEMENTS[0x01f0] = ".";
    REPLACEMENTS[0x01f1] = ".";
    REPLACEMENTS[0x01f2] = ".";
    REPLACEMENTS[0x01f3] = ".";
    REPLACEMENTS[0x01f4] = ".";
    REPLACEMENTS[0x01f5] = ".";
    REPLACEMENTS[0x01f6] = ".";
    REPLACEMENTS[0x01f7] = ".";
    REPLACEMENTS[0x01f8] = ".";
    REPLACEMENTS[0x01f9] = ".";
    REPLACEMENTS[0x01fa] = ".";
    REPLACEMENTS[0x01fb] = ".";
    REPLACEMENTS[0x01fc] = ".";
    REPLACEMENTS[0x01fd] = ".";
    REPLACEMENTS[0x01fe] = ".";
    REPLACEMENTS[0x01ff] = ".";
    REPLACEMENTS[0x0200] = ".";
    REPLACEMENTS[0x0201] = ".";
    REPLACEMENTS[0x0202] = ".";
    REPLACEMENTS[0x0203] = ".";
    REPLACEMENTS[0x0204] = ".";
    REPLACEMENTS[0x0205] = ".";
    REPLACEMENTS[0x0206] = ".";
    REPLACEMENTS[0x0207] = ".";
    REPLACEMENTS[0x0208] = ".";
    REPLACEMENTS[0x0209] = ".";
    REPLACEMENTS[0x020a] = ".";
    REPLACEMENTS[0x020b] = ".";
    REPLACEMENTS[0x020c] = ".";
    REPLACEMENTS[0x020d] = ".";
    REPLACEMENTS[0x020e] = ".";
    REPLACEMENTS[0x020f] = ".";
    REPLACEMENTS[0x0210] = ".";
    REPLACEMENTS[0x0211] = ".";
    REPLACEMENTS[0x0212] = ".";
    REPLACEMENTS[0x0213] = ".";
    REPLACEMENTS[0x0214] = ".";
    REPLACEMENTS[0x0215] = ".";
    REPLACEMENTS[0x0216] = ".";
    REPLACEMENTS[0x0217] = ".";
    REPLACEMENTS[0x0218] = "S";
    REPLACEMENTS[0x0219] = "s";
    REPLACEMENTS[0x021a] = "T";
    REPLACEMENTS[0x021b] = "t";
    REPLACEMENTS[0x021c] = ".";
    REPLACEMENTS[0x021d] = ".";
    REPLACEMENTS[0x021e] = ".";
    REPLACEMENTS[0x021f] = ".";
    REPLACEMENTS[0x0220] = ".";
    REPLACEMENTS[0x0221] = ".";
    REPLACEMENTS[0x0222] = ".";
    REPLACEMENTS[0x0223] = ".";
    REPLACEMENTS[0x0224] = ".";
    REPLACEMENTS[0x0225] = ".";
    REPLACEMENTS[0x0226] = ".";
    REPLACEMENTS[0x0227] = ".";
    REPLACEMENTS[0x0228] = ".";
    REPLACEMENTS[0x0229] = ".";
    REPLACEMENTS[0x022a] = ".";
    REPLACEMENTS[0x022b] = ".";
    REPLACEMENTS[0x022c] = ".";
    REPLACEMENTS[0x022d] = ".";
    REPLACEMENTS[0x022e] = ".";
    REPLACEMENTS[0x022f] = ".";
    REPLACEMENTS[0x0230] = ".";
    REPLACEMENTS[0x0231] = ".";
    REPLACEMENTS[0x0232] = ".";
    REPLACEMENTS[0x0233] = ".";
    REPLACEMENTS[0x0234] = ".";
    REPLACEMENTS[0x0235] = ".";
    REPLACEMENTS[0x0236] = ".";
    REPLACEMENTS[0x0237] = ".";
    REPLACEMENTS[0x0238] = ".";
    REPLACEMENTS[0x0239] = ".";
    REPLACEMENTS[0x023a] = ".";
    REPLACEMENTS[0x023b] = ".";
    REPLACEMENTS[0x023c] = ".";
    REPLACEMENTS[0x023d] = ".";
    REPLACEMENTS[0x023e] = ".";
    REPLACEMENTS[0x023f] = ".";
    REPLACEMENTS[0x0240] = ".";
    REPLACEMENTS[0x0241] = ".";
    REPLACEMENTS[0x0242] = ".";
    REPLACEMENTS[0x0243] = ".";
    REPLACEMENTS[0x0244] = ".";
    REPLACEMENTS[0x0245] = ".";
    REPLACEMENTS[0x0246] = ".";
    REPLACEMENTS[0x0247] = ".";
    REPLACEMENTS[0x0248] = ".";
    REPLACEMENTS[0x0249] = ".";
    REPLACEMENTS[0x024a] = ".";
    REPLACEMENTS[0x024b] = ".";
    REPLACEMENTS[0x024c] = ".";
    REPLACEMENTS[0x024d] = ".";
    REPLACEMENTS[0x024e] = ".";
    REPLACEMENTS[0x024f] = ".";
    REPLACEMENTS[0x0250] = ".";
    REPLACEMENTS[0x0251] = ".";
    REPLACEMENTS[0x0252] = ".";
    REPLACEMENTS[0x0253] = ".";
    REPLACEMENTS[0x0254] = ".";
    REPLACEMENTS[0x0255] = ".";
    REPLACEMENTS[0x0256] = ".";
    REPLACEMENTS[0x0257] = ".";
    REPLACEMENTS[0x0258] = ".";
    REPLACEMENTS[0x0259] = ".";
    REPLACEMENTS[0x025a] = ".";
    REPLACEMENTS[0x025b] = ".";
    REPLACEMENTS[0x025c] = ".";
    REPLACEMENTS[0x025d] = ".";
    REPLACEMENTS[0x025e] = ".";
    REPLACEMENTS[0x025f] = ".";
    REPLACEMENTS[0x0260] = ".";
    REPLACEMENTS[0x0261] = ".";
    REPLACEMENTS[0x0262] = ".";
    REPLACEMENTS[0x0263] = ".";
    REPLACEMENTS[0x0264] = ".";
    REPLACEMENTS[0x0265] = ".";
    REPLACEMENTS[0x0266] = ".";
    REPLACEMENTS[0x0267] = ".";
    REPLACEMENTS[0x0268] = ".";
    REPLACEMENTS[0x0269] = ".";
    REPLACEMENTS[0x026a] = ".";
    REPLACEMENTS[0x026b] = ".";
    REPLACEMENTS[0x026c] = ".";
    REPLACEMENTS[0x026d] = ".";
    REPLACEMENTS[0x026e] = ".";
    REPLACEMENTS[0x026f] = ".";
    REPLACEMENTS[0x0270] = ".";
    REPLACEMENTS[0x0271] = ".";
    REPLACEMENTS[0x0272] = ".";
    REPLACEMENTS[0x0273] = ".";
    REPLACEMENTS[0x0274] = ".";
    REPLACEMENTS[0x0275] = ".";
    REPLACEMENTS[0x0276] = ".";
    REPLACEMENTS[0x0277] = ".";
    REPLACEMENTS[0x0278] = ".";
    REPLACEMENTS[0x0279] = ".";
    REPLACEMENTS[0x027a] = ".";
    REPLACEMENTS[0x027b] = ".";
    REPLACEMENTS[0x027c] = ".";
    REPLACEMENTS[0x027d] = ".";
    REPLACEMENTS[0x027e] = ".";
    REPLACEMENTS[0x027f] = ".";
    REPLACEMENTS[0x0280] = ".";
    REPLACEMENTS[0x0281] = ".";
    REPLACEMENTS[0x0282] = ".";
    REPLACEMENTS[0x0283] = ".";
    REPLACEMENTS[0x0284] = ".";
    REPLACEMENTS[0x0285] = ".";
    REPLACEMENTS[0x0286] = ".";
    REPLACEMENTS[0x0287] = ".";
    REPLACEMENTS[0x0288] = ".";
    REPLACEMENTS[0x0289] = ".";
    REPLACEMENTS[0x028a] = ".";
    REPLACEMENTS[0x028b] = ".";
    REPLACEMENTS[0x028c] = ".";
    REPLACEMENTS[0x028d] = ".";
    REPLACEMENTS[0x028e] = ".";
    REPLACEMENTS[0x028f] = ".";
    REPLACEMENTS[0x0290] = ".";
    REPLACEMENTS[0x0291] = ".";
    REPLACEMENTS[0x0292] = ".";
    REPLACEMENTS[0x0293] = ".";
    REPLACEMENTS[0x0294] = ".";
    REPLACEMENTS[0x0295] = ".";
    REPLACEMENTS[0x0296] = ".";
    REPLACEMENTS[0x0297] = ".";
    REPLACEMENTS[0x0298] = ".";
    REPLACEMENTS[0x0299] = ".";
    REPLACEMENTS[0x029a] = ".";
    REPLACEMENTS[0x029b] = ".";
    REPLACEMENTS[0x029c] = ".";
    REPLACEMENTS[0x029d] = ".";
    REPLACEMENTS[0x029e] = ".";
    REPLACEMENTS[0x029f] = ".";
    REPLACEMENTS[0x02a0] = ".";
    REPLACEMENTS[0x02a1] = ".";
    REPLACEMENTS[0x02a2] = ".";
    REPLACEMENTS[0x02a3] = ".";
    REPLACEMENTS[0x02a4] = ".";
    REPLACEMENTS[0x02a5] = ".";
    REPLACEMENTS[0x02a6] = ".";
    REPLACEMENTS[0x02a7] = ".";
    REPLACEMENTS[0x02a8] = ".";
    REPLACEMENTS[0x02a9] = ".";
    REPLACEMENTS[0x02aa] = ".";
    REPLACEMENTS[0x02ab] = ".";
    REPLACEMENTS[0x02ac] = ".";
    REPLACEMENTS[0x02ad] = ".";
    REPLACEMENTS[0x02ae] = ".";
    REPLACEMENTS[0x02af] = ".";
    REPLACEMENTS[0x02b0] = ".";
    REPLACEMENTS[0x02b1] = ".";
    REPLACEMENTS[0x02b2] = ".";
    REPLACEMENTS[0x02b3] = ".";
    REPLACEMENTS[0x02b4] = ".";
    REPLACEMENTS[0x02b5] = ".";
    REPLACEMENTS[0x02b6] = ".";
    REPLACEMENTS[0x02b7] = ".";
    REPLACEMENTS[0x02b8] = ".";
    REPLACEMENTS[0x02b9] = ".";
    REPLACEMENTS[0x02ba] = ".";
    REPLACEMENTS[0x02bb] = ".";
    REPLACEMENTS[0x02bc] = ".";
    REPLACEMENTS[0x02bd] = ".";
    REPLACEMENTS[0x02be] = ".";
    REPLACEMENTS[0x02bf] = ".";
    REPLACEMENTS[0x02c0] = ".";
    REPLACEMENTS[0x02c1] = ".";
    REPLACEMENTS[0x02c2] = ".";
    REPLACEMENTS[0x02c3] = ".";
    REPLACEMENTS[0x02c4] = ".";
    REPLACEMENTS[0x02c5] = ".";
    REPLACEMENTS[0x02c6] = ".";
    REPLACEMENTS[0x02c7] = ".";
    REPLACEMENTS[0x02c8] = ".";
    REPLACEMENTS[0x02c9] = ".";
    REPLACEMENTS[0x02ca] = ".";
    REPLACEMENTS[0x02cb] = ".";
    REPLACEMENTS[0x02cc] = ".";
    REPLACEMENTS[0x02cd] = ".";
    REPLACEMENTS[0x02ce] = ".";
    REPLACEMENTS[0x02cf] = ".";
    REPLACEMENTS[0x02d0] = ".";
    REPLACEMENTS[0x02d1] = ".";
    REPLACEMENTS[0x02d2] = ".";
    REPLACEMENTS[0x02d3] = ".";
    REPLACEMENTS[0x02d4] = ".";
    REPLACEMENTS[0x02d5] = ".";
    REPLACEMENTS[0x02d6] = ".";
    REPLACEMENTS[0x02d7] = ".";
    REPLACEMENTS[0x02d8] = ".";
    REPLACEMENTS[0x02d9] = ".";
    REPLACEMENTS[0x02da] = ".";
    REPLACEMENTS[0x02db] = ".";
    REPLACEMENTS[0x02dc] = ".";
    REPLACEMENTS[0x02dd] = ".";
    REPLACEMENTS[0x02de] = ".";
    REPLACEMENTS[0x02df] = ".";
    REPLACEMENTS[0x02e0] = ".";
    REPLACEMENTS[0x02e1] = ".";
    REPLACEMENTS[0x02e2] = ".";
    REPLACEMENTS[0x02e3] = ".";
    REPLACEMENTS[0x02e4] = ".";
    REPLACEMENTS[0x02e5] = ".";
    REPLACEMENTS[0x02e6] = ".";
    REPLACEMENTS[0x02e7] = ".";
    REPLACEMENTS[0x02e8] = ".";
    REPLACEMENTS[0x02e9] = ".";
    REPLACEMENTS[0x02ea] = ".";
    REPLACEMENTS[0x02eb] = ".";
    REPLACEMENTS[0x02ec] = ".";
    REPLACEMENTS[0x02ed] = ".";
    REPLACEMENTS[0x02ee] = ".";
    REPLACEMENTS[0x02ef] = ".";
    REPLACEMENTS[0x02f0] = ".";
    REPLACEMENTS[0x02f1] = ".";
    REPLACEMENTS[0x02f2] = ".";
    REPLACEMENTS[0x02f3] = ".";
    REPLACEMENTS[0x02f4] = ".";
    REPLACEMENTS[0x02f5] = ".";
    REPLACEMENTS[0x02f6] = ".";
    REPLACEMENTS[0x02f7] = ".";
    REPLACEMENTS[0x02f8] = ".";
    REPLACEMENTS[0x02f9] = ".";
    REPLACEMENTS[0x02fa] = ".";
    REPLACEMENTS[0x02fb] = ".";
    REPLACEMENTS[0x02fc] = ".";
    REPLACEMENTS[0x02fd] = ".";
    REPLACEMENTS[0x02fe] = ".";
    REPLACEMENTS[0x02ff] = ".";
    REPLACEMENTS[0x0300] = ".";
    REPLACEMENTS[0x0301] = ".";
    REPLACEMENTS[0x0302] = ".";
    REPLACEMENTS[0x0303] = ".";
    REPLACEMENTS[0x0304] = ".";
    REPLACEMENTS[0x0305] = ".";
    REPLACEMENTS[0x0306] = ".";
    REPLACEMENTS[0x0307] = ".";
    REPLACEMENTS[0x0308] = ".";
    REPLACEMENTS[0x0309] = ".";
    REPLACEMENTS[0x030a] = ".";
    REPLACEMENTS[0x030b] = ".";
    REPLACEMENTS[0x030c] = ".";
    REPLACEMENTS[0x030d] = ".";
    REPLACEMENTS[0x030e] = ".";
    REPLACEMENTS[0x030f] = ".";
    REPLACEMENTS[0x0310] = ".";
    REPLACEMENTS[0x0311] = ".";
    REPLACEMENTS[0x0312] = ".";
    REPLACEMENTS[0x0313] = ".";
    REPLACEMENTS[0x0314] = ".";
    REPLACEMENTS[0x0315] = ".";
    REPLACEMENTS[0x0316] = ".";
    REPLACEMENTS[0x0317] = ".";
    REPLACEMENTS[0x0318] = ".";
    REPLACEMENTS[0x0319] = ".";
    REPLACEMENTS[0x031a] = ".";
    REPLACEMENTS[0x031b] = ".";
    REPLACEMENTS[0x031c] = ".";
    REPLACEMENTS[0x031d] = ".";
    REPLACEMENTS[0x031e] = ".";
    REPLACEMENTS[0x031f] = ".";
    REPLACEMENTS[0x0320] = ".";
    REPLACEMENTS[0x0321] = ".";
    REPLACEMENTS[0x0322] = ".";
    REPLACEMENTS[0x0323] = ".";
    REPLACEMENTS[0x0324] = ".";
    REPLACEMENTS[0x0325] = ".";
    REPLACEMENTS[0x0326] = ".";
    REPLACEMENTS[0x0327] = ".";
    REPLACEMENTS[0x0328] = ".";
    REPLACEMENTS[0x0329] = ".";
    REPLACEMENTS[0x032a] = ".";
    REPLACEMENTS[0x032b] = ".";
    REPLACEMENTS[0x032c] = ".";
    REPLACEMENTS[0x032d] = ".";
    REPLACEMENTS[0x032e] = ".";
    REPLACEMENTS[0x032f] = ".";
    REPLACEMENTS[0x0330] = ".";
    REPLACEMENTS[0x0331] = ".";
    REPLACEMENTS[0x0332] = ".";
    REPLACEMENTS[0x0333] = ".";
    REPLACEMENTS[0x0334] = ".";
    REPLACEMENTS[0x0335] = ".";
    REPLACEMENTS[0x0336] = ".";
    REPLACEMENTS[0x0337] = ".";
    REPLACEMENTS[0x0338] = ".";
    REPLACEMENTS[0x0339] = ".";
    REPLACEMENTS[0x033a] = ".";
    REPLACEMENTS[0x033b] = ".";
    REPLACEMENTS[0x033c] = ".";
    REPLACEMENTS[0x033d] = ".";
    REPLACEMENTS[0x033e] = ".";
    REPLACEMENTS[0x033f] = ".";
    REPLACEMENTS[0x0340] = ".";
    REPLACEMENTS[0x0341] = ".";
    REPLACEMENTS[0x0342] = ".";
    REPLACEMENTS[0x0343] = ".";
    REPLACEMENTS[0x0344] = ".";
    REPLACEMENTS[0x0345] = ".";
    REPLACEMENTS[0x0346] = ".";
    REPLACEMENTS[0x0347] = ".";
    REPLACEMENTS[0x0348] = ".";
    REPLACEMENTS[0x0349] = ".";
    REPLACEMENTS[0x034a] = ".";
    REPLACEMENTS[0x034b] = ".";
    REPLACEMENTS[0x034c] = ".";
    REPLACEMENTS[0x034d] = ".";
    REPLACEMENTS[0x034e] = ".";
    REPLACEMENTS[0x034f] = ".";
    REPLACEMENTS[0x0350] = ".";
    REPLACEMENTS[0x0351] = ".";
    REPLACEMENTS[0x0352] = ".";
    REPLACEMENTS[0x0353] = ".";
    REPLACEMENTS[0x0354] = ".";
    REPLACEMENTS[0x0355] = ".";
    REPLACEMENTS[0x0356] = ".";
    REPLACEMENTS[0x0357] = ".";
    REPLACEMENTS[0x0358] = ".";
    REPLACEMENTS[0x0359] = ".";
    REPLACEMENTS[0x035a] = ".";
    REPLACEMENTS[0x035b] = ".";
    REPLACEMENTS[0x035c] = ".";
    REPLACEMENTS[0x035d] = ".";
    REPLACEMENTS[0x035e] = ".";
    REPLACEMENTS[0x035f] = ".";
    REPLACEMENTS[0x0360] = ".";
    REPLACEMENTS[0x0361] = ".";
    REPLACEMENTS[0x0362] = ".";
    REPLACEMENTS[0x0363] = ".";
    REPLACEMENTS[0x0364] = ".";
    REPLACEMENTS[0x0365] = ".";
    REPLACEMENTS[0x0366] = ".";
    REPLACEMENTS[0x0367] = ".";
    REPLACEMENTS[0x0368] = ".";
    REPLACEMENTS[0x0369] = ".";
    REPLACEMENTS[0x036a] = ".";
    REPLACEMENTS[0x036b] = ".";
    REPLACEMENTS[0x036c] = ".";
    REPLACEMENTS[0x036d] = ".";
    REPLACEMENTS[0x036e] = ".";
    REPLACEMENTS[0x036f] = ".";
    REPLACEMENTS[0x0370] = ".";
    REPLACEMENTS[0x0371] = ".";
    REPLACEMENTS[0x0372] = ".";
    REPLACEMENTS[0x0373] = ".";
    REPLACEMENTS[0x0374] = ".";
    REPLACEMENTS[0x0375] = ".";
    REPLACEMENTS[0x0376] = ".";
    REPLACEMENTS[0x0377] = ".";
    REPLACEMENTS[0x0378] = ".";
    REPLACEMENTS[0x0379] = ".";
    REPLACEMENTS[0x037a] = ".";
    REPLACEMENTS[0x037b] = ".";
    REPLACEMENTS[0x037c] = ".";
    REPLACEMENTS[0x037d] = ".";
    REPLACEMENTS[0x037e] = ".";
    REPLACEMENTS[0x037f] = ".";
    REPLACEMENTS[0x0380] = ".";
    REPLACEMENTS[0x0381] = ".";
    REPLACEMENTS[0x0382] = ".";
    REPLACEMENTS[0x0383] = ".";
    REPLACEMENTS[0x0384] = ".";
    REPLACEMENTS[0x0385] = ".";
    REPLACEMENTS[0x0386] = "A";
    REPLACEMENTS[0x0387] = ".";
    REPLACEMENTS[0x0388] = "E";
    REPLACEMENTS[0x0389] = "I";
    REPLACEMENTS[0x038a] = "I";
    REPLACEMENTS[0x038b] = ".";
    REPLACEMENTS[0x038c] = "O";
    REPLACEMENTS[0x038d] = ".";
    REPLACEMENTS[0x038e] = "Y";
    REPLACEMENTS[0x038f] = "O";
    REPLACEMENTS[0x0390] = "i";
    REPLACEMENTS[0x0391] = "A";
    REPLACEMENTS[0x0392] = "V";
    REPLACEMENTS[0x0393] = "G";
    REPLACEMENTS[0x0394] = "D";
    REPLACEMENTS[0x0395] = "E";
    REPLACEMENTS[0x0396] = "Z";
    REPLACEMENTS[0x0397] = "I";
    REPLACEMENTS[0x0398] = "TH";
    REPLACEMENTS[0x0399] = "I";
    REPLACEMENTS[0x039a] = "K";
    REPLACEMENTS[0x039b] = "L";
    REPLACEMENTS[0x039c] = "M";
    REPLACEMENTS[0x039d] = "N";
    REPLACEMENTS[0x039e] = "X";
    REPLACEMENTS[0x039f] = "O";
    REPLACEMENTS[0x03a0] = "P";
    REPLACEMENTS[0x03a1] = "R";
    REPLACEMENTS[0x03a2] = ".";
    REPLACEMENTS[0x03a3] = "S";
    REPLACEMENTS[0x03a4] = "T";
    REPLACEMENTS[0x03a5] = "Y";
    REPLACEMENTS[0x03a6] = "F";
    REPLACEMENTS[0x03a7] = "CH";
    REPLACEMENTS[0x03a8] = "PS";
    REPLACEMENTS[0x03a9] = "O";
    REPLACEMENTS[0x03aa] = "I";
    REPLACEMENTS[0x03ab] = "Y";
    REPLACEMENTS[0x03ac] = "a";
    REPLACEMENTS[0x03ad] = "e";
    REPLACEMENTS[0x03ae] = "i";
    REPLACEMENTS[0x03af] = "i";
    REPLACEMENTS[0x03b0] = "y";
    REPLACEMENTS[0x03b1] = "a";
    REPLACEMENTS[0x03b2] = "v";
    REPLACEMENTS[0x03b3] = "g";
    REPLACEMENTS[0x03b4] = "d";
    REPLACEMENTS[0x03b5] = "e";
    REPLACEMENTS[0x03b6] = "z";
    REPLACEMENTS[0x03b7] = "i";
    REPLACEMENTS[0x03b8] = "th";
    REPLACEMENTS[0x03b9] = "i";
    REPLACEMENTS[0x03ba] = "k";
    REPLACEMENTS[0x03bb] = "l";
    REPLACEMENTS[0x03bc] = "m";
    REPLACEMENTS[0x03bd] = "n";
    REPLACEMENTS[0x03be] = "x";
    REPLACEMENTS[0x03bf] = "o";
    REPLACEMENTS[0x03c0] = "p";
    REPLACEMENTS[0x03c1] = "r";
    REPLACEMENTS[0x03c2] = "s";
    REPLACEMENTS[0x03c3] = "s";
    REPLACEMENTS[0x03c4] = "t";
    REPLACEMENTS[0x03c5] = "y";
    REPLACEMENTS[0x03c6] = "f";
    REPLACEMENTS[0x03c7] = "ch";
    REPLACEMENTS[0x03c8] = "ps";
    REPLACEMENTS[0x03c9] = "o";
    REPLACEMENTS[0x03ca] = "i";
    REPLACEMENTS[0x03cb] = "y";
    REPLACEMENTS[0x03cc] = "o";
    REPLACEMENTS[0x03cd] = "y";
    REPLACEMENTS[0x03ce] = "o";
    REPLACEMENTS[0x03cf] = ".";
    REPLACEMENTS[0x03d0] = ".";
    REPLACEMENTS[0x03d1] = ".";
    REPLACEMENTS[0x03d2] = ".";
    REPLACEMENTS[0x03d3] = ".";
    REPLACEMENTS[0x03d4] = ".";
    REPLACEMENTS[0x03d5] = ".";
    REPLACEMENTS[0x03d6] = ".";
    REPLACEMENTS[0x03d7] = ".";
    REPLACEMENTS[0x03d8] = ".";
    REPLACEMENTS[0x03d9] = ".";
    REPLACEMENTS[0x03da] = ".";
    REPLACEMENTS[0x03db] = ".";
    REPLACEMENTS[0x03dc] = ".";
    REPLACEMENTS[0x03dd] = ".";
    REPLACEMENTS[0x03de] = ".";
    REPLACEMENTS[0x03df] = ".";
    REPLACEMENTS[0x03e0] = ".";
    REPLACEMENTS[0x03e1] = ".";
    REPLACEMENTS[0x03e2] = ".";
    REPLACEMENTS[0x03e3] = ".";
    REPLACEMENTS[0x03e4] = ".";
    REPLACEMENTS[0x03e5] = ".";
    REPLACEMENTS[0x03e6] = ".";
    REPLACEMENTS[0x03e7] = ".";
    REPLACEMENTS[0x03e8] = ".";
    REPLACEMENTS[0x03e9] = ".";
    REPLACEMENTS[0x03ea] = ".";
    REPLACEMENTS[0x03eb] = ".";
    REPLACEMENTS[0x03ec] = ".";
    REPLACEMENTS[0x03ed] = ".";
    REPLACEMENTS[0x03ee] = ".";
    REPLACEMENTS[0x03ef] = ".";
    REPLACEMENTS[0x03f0] = ".";
    REPLACEMENTS[0x03f1] = ".";
    REPLACEMENTS[0x03f2] = ".";
    REPLACEMENTS[0x03f3] = ".";
    REPLACEMENTS[0x03f4] = ".";
    REPLACEMENTS[0x03f5] = ".";
    REPLACEMENTS[0x03f6] = ".";
    REPLACEMENTS[0x03f7] = ".";
    REPLACEMENTS[0x03f8] = ".";
    REPLACEMENTS[0x03f9] = ".";
    REPLACEMENTS[0x03fa] = ".";
    REPLACEMENTS[0x03fb] = ".";
    REPLACEMENTS[0x03fc] = ".";
    REPLACEMENTS[0x03fd] = ".";
    REPLACEMENTS[0x03fe] = ".";
    REPLACEMENTS[0x03ff] = ".";
    REPLACEMENTS[0x0400] = ".";
    REPLACEMENTS[0x0401] = ".";
    REPLACEMENTS[0x0402] = ".";
    REPLACEMENTS[0x0403] = ".";
    REPLACEMENTS[0x0404] = ".";
    REPLACEMENTS[0x0405] = ".";
    REPLACEMENTS[0x0406] = ".";
    REPLACEMENTS[0x0407] = ".";
    REPLACEMENTS[0x0408] = ".";
    REPLACEMENTS[0x0409] = ".";
    REPLACEMENTS[0x040a] = ".";
    REPLACEMENTS[0x040b] = ".";
    REPLACEMENTS[0x040c] = ".";
    REPLACEMENTS[0x040d] = ".";
    REPLACEMENTS[0x040e] = ".";
    REPLACEMENTS[0x040f] = ".";
    REPLACEMENTS[0x0410] = "A";
    REPLACEMENTS[0x0411] = "B";
    REPLACEMENTS[0x0412] = "V";
    REPLACEMENTS[0x0413] = "G";
    REPLACEMENTS[0x0414] = "D";
    REPLACEMENTS[0x0415] = "E";
    REPLACEMENTS[0x0416] = "ZH";
    REPLACEMENTS[0x0417] = "Z";
    REPLACEMENTS[0x0418] = "I";
    REPLACEMENTS[0x0419] = "Y";
    REPLACEMENTS[0x041a] = "K";
    REPLACEMENTS[0x041b] = "L";
    REPLACEMENTS[0x041c] = "M";
    REPLACEMENTS[0x041d] = "N";
    REPLACEMENTS[0x041e] = "O";
    REPLACEMENTS[0x041f] = "P";
    REPLACEMENTS[0x0420] = "R";
    REPLACEMENTS[0x0421] = "S";
    REPLACEMENTS[0x0422] = "T";
    REPLACEMENTS[0x0423] = "U";
    REPLACEMENTS[0x0424] = "F";
    REPLACEMENTS[0x0425] = "H";
    REPLACEMENTS[0x0426] = "TS";
    REPLACEMENTS[0x0427] = "CH";
    REPLACEMENTS[0x0428] = "SH";
    REPLACEMENTS[0x0429] = "SHT";
    REPLACEMENTS[0x042a] = "A";
    REPLACEMENTS[0x042b] = ".";
    REPLACEMENTS[0x042c] = "Y";
    REPLACEMENTS[0x042d] = ".";
    REPLACEMENTS[0x042e] = "YU";
    REPLACEMENTS[0x042f] = "YA";
    REPLACEMENTS[0x0430] = "a";
    REPLACEMENTS[0x0431] = "b";
    REPLACEMENTS[0x0432] = "v";
    REPLACEMENTS[0x0433] = "g";
    REPLACEMENTS[0x0434] = "d";
    REPLACEMENTS[0x0435] = "e";
    REPLACEMENTS[0x0436] = "zh";
    REPLACEMENTS[0x0437] = "z";
    REPLACEMENTS[0x0438] = "i";
    REPLACEMENTS[0x0439] = "y";
    REPLACEMENTS[0x043a] = "k";
    REPLACEMENTS[0x043b] = "l";
    REPLACEMENTS[0x043c] = "m";
    REPLACEMENTS[0x043d] = "n";
    REPLACEMENTS[0x043e] = "o";
    REPLACEMENTS[0x043f] = "p";
    REPLACEMENTS[0x0440] = "r";
    REPLACEMENTS[0x0441] = "s";
    REPLACEMENTS[0x0442] = "t";
    REPLACEMENTS[0x0443] = "u";
    REPLACEMENTS[0x0444] = "f";
    REPLACEMENTS[0x0445] = "h";
    REPLACEMENTS[0x0446] = "ts";
    REPLACEMENTS[0x0447] = "ch";
    REPLACEMENTS[0x0448] = "sh";
    REPLACEMENTS[0x0449] = "sht";
    REPLACEMENTS[0x044a] = "a";
    REPLACEMENTS[0x044b] = ".";
    REPLACEMENTS[0x044c] = "y";
    REPLACEMENTS[0x044d] = ".";
    REPLACEMENTS[0x044e] = "yu";
    REPLACEMENTS[0x044f] = "a";
    REPLACEMENTS[0x0450] = ".";
    REPLACEMENTS[0x0451] = ".";
    REPLACEMENTS[0x0452] = ".";
    REPLACEMENTS[0x0453] = ".";
    REPLACEMENTS[0x0454] = ".";
    REPLACEMENTS[0x0455] = ".";
    REPLACEMENTS[0x0456] = ".";
    REPLACEMENTS[0x0457] = ".";
    REPLACEMENTS[0x0458] = ".";
    REPLACEMENTS[0x0459] = ".";
    REPLACEMENTS[0x045a] = ".";
    REPLACEMENTS[0x045b] = ".";
    REPLACEMENTS[0x045c] = ".";
    REPLACEMENTS[0x045d] = ".";
    REPLACEMENTS[0x045e] = ".";
    REPLACEMENTS[0x045f] = ".";
    REPLACEMENTS[0x20ac] = "E";
  }

  @Override
  public String[] getReplacements() {
    return REPLACEMENTS;
  }
}
