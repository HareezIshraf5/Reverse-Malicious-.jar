import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Arrays;

public class StringDecryptor {

    public static void main(String[] args) {
        deobfuscateStrings();
    }

    private static void deobfuscateStrings() {
        // Process each encrypted string in the exact original format
        processEntry(0, "DES", "S8+Gx1mBYug=", "oYgzM");
        processEntry(1, "XOR", "HxUoIicsKy4nIR8PKC8xLC8yHQY3OTM1dQ49LzQJEyouJiciNTIdBjc5MzUgMwQSMTosNm8kLSY=", "CXAAU");
        processEntry(2, "XOR", "", "Ghjql");
        processEntry(3, "DES", "BdpWST5DQcM3jV8HdnOWZg==", "WXZvU");
        processEntry(4, "DES", "4C0IZSSqbUPeJteNCVu8/HvamQ7/7gTorJ2thEtSM4M=", "AYlWW");
        processEntry(5, "XOR", "FjsqIAYDKg==", "WkzdG");
        processEntry(6, "XOR", "NgUYCwUFOx4OAzYfGAYTBT8CNCQeKQMcVyctHx0rOjoeDwULJQI0JB4pAxwCGhQiGBgFJl8NDw8=", "jHqhw");
        processEntry(7, "DES", "aYl5mhJqLBI=", "xGtYN");
        processEntry(8, "BlowFish", "VV7IsaU2UXWmKxxGOg/h2a3Hc27ow4CyKpSxhlLIpM7VDNqFr80q2pZK2Vz7ErJx", "jVLzl");
        processEntry(9, "BlowFish", "hiLjppCYfdCKeEvOU8HGLSCg8d/HmuriQQ9hlP8xfJE=", "hAspe");
        processEntry(10, "BlowFish",
                "PHjR5GJm4f4gEFQE1KbIuHw2CRRS/GRjRvWzpSELlCgHcnfCd4HuGFSRcE7EO/WdH0bqZhB1ct/HFcDeGYnjdHWLL6TI+KIH",
                "iTsNH");
        processEntry(11, "XOR", "8K6HoO+5vHM5BmU9MgQgf1M=", "EEsSi");
        processEntry(12, "XOR", "8KmtvnYZPDgfPyppEyNsaQ==", "ZsVII");
        processEntry(13, "DES", "gGmn9U0uoINUVg8Nh30ihsrmIE1b8JxeunhHwFuY1zCXifPgdLpgBg==", "OODZR");
        processEntry(14, "XOR", "8Ke1vmsiChEMJBQHQjskDQYMRzhPQwQAPggHWE8=", "boKfc");
        processEntry(15, "XOR", "4p+X77mJbB4kHSMicGs=", "vFLJK");
        processEntry(16, "BlowFish",
                "5UgZxuMes4Ngj7pDgasuQHN7IvPKzW2G1jlVwEUGdUKPhke4KPanVTuLgVg/4rcQdVx7ltJiodIZeno/WwDbuw==", "QmOMT");
        processEntry(17, "XOR", "4puL77mlVg0DGQUEaBIDDxUjGAUNVgwYGAkZOhVLHhkjFAUZTGg=", "kjvHq");
        processEntry(18, "DES", "Hcay5JZ8eRN1ThtyDLx2KzUI4wVuRZNHrCiXX6cpIJnbdFdp6CNupg==", "ELyRv");
        processEntry(19, "DES", "KEa3vtkNZGkyRZCGnYaVIPAXjqlHzpKGitz6IMBYYOE=", "ftPKP");
        processEntry(20, "DES", "ULMY+HhAC91ytjV9Qn04Dg==", "TvEtY");
        processEntry(21, "BlowFish", "UOp2FlJ9juRNqb2CK3ZcAKBXCkkOd1JDFPA1OqgeMzk=", "UEiVC");
        processEntry(22, "DES", "CYbByD1R0DX/69Mto1ciGHhdu3FKfwlgXq+PSNTdTZk=", "agaDP");
        processEntry(23, "BlowFish", "W6NUW3MaNUA=", "wgQiQ");
        processEntry(24, "BlowFish", "Ot4J5HobPjMjlbZ+WVkUkt+kt1cM5GcXqMrQDq/HpJA/Sd72irdv7jaIVPWKF9Zs", "aMwJu");
        processEntry(25, "DES", "KUfMj7Z2/KCKQu1b2jdIhQ==", "diest");
        processEntry(26, "XOR", "WgcxKQ==", "tbILc");
        processEntry(27, "DES", "xPgO0V8gbJipxGsXh1VIuw1Picmm321N", "CnziJ");
        processEntry(28, "BlowFish", "y3v+QE/z0DwDt2ff30R03pKI/8v3eZa0yMBMa2VuA9IIfGFvYZQhlA==", "QLvjS");
        processEntry(29, "BlowFish", "uZgsqBfmO7wokxFR5e8iZyue5w0gFmPAJV7Xex6BjKjbhul/AddUyze73W9qkZbw", "cgYYf");
        processEntry(30, "BlowFish", "0Sz/qRTJ4T3oPR5ME3KCiILHWdBd18Ft3L06c3S1HD8=", "ForfT");
        processEntry(31, "XOR", "4pyecycJJj42BUg7PXMFBzg8Pw4JK3IBFAYqHjoVDWE3KwQ=", "RSahO");
        processEntry(32, "BlowFish", "zail1d6o0zJqDtSANS4SuxPK13KH0llPpyBI17jg95++kGL9lfUXB8WlTjBQclzq", "oftYe");
        processEntry(33, "BlowFish", "BkxBJ5iFW20eAglF+Qx9AGuxCHQedRYY6Y8gV5Smz32si75s/sJgFvBrpy7fH+1t", "opGom");
        processEntry(34, "XOR", "4p22ZAUcEx0oLhIAFiBhIREdIQ0aEBZqJAsB", "sDAsd");
        processEntry(35, "DES", "EER1d49QtNwKkQX62hcJNgcftkIb0sA4Rmg9Py4ND8lmzx/NRDkwvQ==", "nzeHX");
        processEntry(36, "XOR", "4pyqThYKGAkccxALCAo/EQQBTgENBAMiOgwPRh02Gx4PAT1CSg==", "fnSxj");
        processEntry(37, "BlowFish", "qVPUE0zf97m2UMzqVfFRMreDtN1EbJBlCp3TTjt+aFeyB3ktZtpCgUHImEmiv/Xf", "FBGfi");
        processEntry(38, "XOR", "EHQjFhowdCwPDzQkHR4DP3QBFh9xOwoUGSMmDBNC", "QTiwl");
        processEntry(39, "DES", "tWrsewgwl+FTMpqJmwmcuzdRQU53yFWqRfKsUGxUcaA=", "JXPqT");
        processEntry(40, "DES", "7Y2f0b0PeoTd2+xlqkQNkFegPukqOTH+Ys2vW/EDpATARVrusDAq5g==", "vhgax");
        processEntry(41, "DES", "tHdp8nZO39ageK21QgFUZsjlOP5tO3DS", "Bjnxj");
        processEntry(42, "XOR", "4pyNeQs5AS08KXgcLnkoIA0iLDk9SBIpIjcGbzw1PVJh", "AYMXh");
        processEntry(43, "BlowFish", "8aUPv1mpx7LAhv7Nqdu470pB1dD2VPvFg6BGPmY4jEGr455AjVn5eA==", "MYUiJ");
        processEntry(44, "XOR", "4pyaYScbDzokBVoSOWEFFRE4LQ4bAnYoDBsBMzJPHx4zYRUVRgU1AAgSIzFBHAk6JQQISA==", "VAazf");
        processEntry(45, "DES", "E7MW3GAwFdUTnqmNGvsDHJLDrOGo4Lke9oAr7IR2JtsGGa/cDxEUiQ==", "mcbrh");
        processEntry(46, "XOR", "4pyWTCcPKT8cFh4lNEwGAjgzAgVXLjUbDBslOwg2GBkuDRADPyojDBszYEw=", "ZlbwJ");
        processEntry(47, "XOR", "cBYBPg84OQg=", "JJTMj");
        processEntry(48, "DES", "R+6bzpgvO6DRrq84hhwpuQ==", "VlLLy");
        processEntry(49, "DES", "uOoJ2+S2LW8lZrUI/5q10w/DjqEIKqhf", "Iivxs");
        processEntry(50, "XOR", "8KmNo0cOPiwWCj8+MR0Abz43UwMgPTYfCC4uYlM=", "XsgOJ");
        processEntry(51, "BlowFish", "k0sKsxCRiXI=", "Qhqhi");
        processEntry(52, "XOR", "EzUMJmoHIQw6Mw==", "FFiTG");
        processEntry(53, "BlowFish", "dITo6GJg7vJAsZNxlgUcjg==", "SXXID");
        processEntry(54, "XOR", "8K61lVAmFzQnFQdSFDQDBR0oIhVVMSk1FU9S", "FQpur");
        processEntry(56, "XOR", "4py0SxMJKxQOMUg2F0sxBzUWBzoJJlgNPAQnVksGDTAODidIMB0fIBosHQ9vSA==", "xkUhB");
        processEntry(57, "XOR", "8KOis1oWARYQDjwdFFEePAEWEg46AQpLWg==", "sqzUs");
        processEntry(60, "XOR", "4p2RRDUYKTFEFx4yOggcECExAFMCMDcHFgI2MhEfHTx0EBxLZQ==", "TdsqE");
        processEntry(61, "XOR", "4pyhbzU3PwI9UCEiGiEcKiwJJh4ibQsmHCB3TQ==", "mOpEM");
        processEntry(62, "DES", "XfDGrwKZv6VOpjtFj6TjZHjBr47ELao9Bno6XFYJt+I=", "fZwZb");
        processEntry(63, "XOR", "MDcAGzoSNw==", "eYkuU");
        processEntry(64, "BlowFish", "1I9bu58NNxA=", "gnFjy");
        processEntry(65, "DES", "ZQVKDqKlAog=", "sZwBM");
        processEntry(66, "XOR", "EC8PJj4jEQkjOBA1DysoIxUVGR84AxQxbAEHCDAQHBAJIj4tDxUZHzgDFDE5PD41NSMjDEggNCk=",
                "LbfEL");
        processEntry(67, "DES",
                "JkCKMQ5z9+BuS4Kc1qGjb8A1OmDRzYipS4UGwK875CX9jfbMLA9J9MLBqyE7IRwzj4+yiumBKR22ZoYi6LqA0b8viwR5hWjp",
                "bhlLO");
        processEntry(68, "BlowFish", "NYpouR9PTqI0BWH9+QsRkaNDAd1ZjTmeoXlYS6KTLtRsh/WiMzp3peGIOFbAmbCtOopHx58FOCM=",
                "tvOge");
        processEntry(69, "XOR", "KycEGzF5fF8CKSwlAhgyMH0fGSVsNBEGJyU6HA4xbDodCiUmIF4OOiY=", "CSpkB");
        processEntry(70, "BlowFish", "h0sHTYOQPbsvVwlx7I5W+BTNpume80CW1PSQyApJPGHs1vcbHU0+kwEYi5Qrs+aPFRhYv3qcJw0=",
                "tZOLy");
        processEntry(71, "XOR", "8KuCt24mBz4VIFsSKR9uARYjHSsBVyEbOh1NcQ==", "QzNuw");
        processEntry(72, "DES", "tIl8N84BENh6P9mTXgNsZt1UTtxY3URoZZWRlmBFYJ4DncfyicJwEGw3XP+OvwK1", "YjccY");
        processEntry(73, "BlowFish", "2nFlL3X8wnOeFQyoCYS+WEmrqZ5gsoF/cgpw4ERVMOAByfOb1fjKQUC3FbpPwqk3", "vDfBh");
        processEntry(74, "DES", "psF9qiC3kI7TgX9d4KERwVAq3f+axCrbRF8lu3M7afQ=", "YMzFo");
        processEntry(75, "BlowFish", "VCyDqlV+3JamikS9+NqKXA==", "URqHK");
        processEntry(76, "DES", "lJr8evhV3O8=", "mjdgA");
        processEntry(77, "BlowFish", "ZwNrPPIvX0DYCsjEthgT20VR3p75eefpD2ur8PTYG51uGNqedJusKuzf5qu2g6kAZrIMX+VWvH4=",
                "COsZk");
        processEntry(78, "XOR", "8K+is3kAIy0zMD0hYzs2NDVjNjc3ZjA0KzYjLSQxPDJjIzZzMSY1MTwpKHl3fQ==", "CWYSF");
        processEntry(79, "XOR", "Og4tBhxoVXYfBD0MKwUfIVQ2BAh9HTgbCjQTNRMcfQkwHQp8CjEG", "RzYvo");
        processEntry(80, "XOR", "CiImNw==", "Zmucf");
        processEntry(81, "XOR", "W3lcbxAZIR8mMwQt", "vTqBR");
        processEntry(82, "XOR", "FiYaLC07PVkMMSUs", "UItXH");
        processEntry(83, "BlowFish", "ldyJ/qrn4GtlEfykGMCbau3VxzjW4tcZO+zziRxFI+0=", "hGSqq");
        processEntry(84, "BlowFish", "C/K45gJv3zo=", "AJVmi");
        processEntry(85, "BlowFish", "6O8glLGEhnQ=", "wVaIL");
        processEntry(86, "DES", "EwdiauHNzkg=", "DcPcj");
        processEntry(87, "BlowFish", "c0wE5duBi0dU3LVI7QL56hb9K8J+gjyf", "CQIpw");
        processEntry(88, "BlowFish",
                "jYEuCU5TX84hc9d4za8lIfzcMyYG7Ogbk8yxFtHA7/rJBrU5UP7Gv0yjspsMHNdiwAh34XPvvFmZTzzm9YyXBX63hjjiiHzWrFPh0jBf0jJblRlLBxN/ng==",
                "uwGzO");
        processEntry(89, "XOR", "MQ==", "mTnuP");
        processEntry(90, "BlowFish", "aWpBpufZY14=", "bUzDD");
        processEntry(91, "BlowFish", "r0x9Cn7GqSE=", "WZDVC");
        processEntry(92, "DES", "O2r89PBC9e4=", "zBNpQ");
        processEntry(93, "XOR", "cg==", "xDrVr");
        processEntry(94, "DES", "s1A9CsPD4rU=", "NFskU");
        processEntry(95, "DES", "aSd1ouZBrhc=", "fDArS");
        processEntry(96, "XOR", "GhsoWGs=", "OOnuS");
        processEntry(97, "XOR", "XHw=", "qQWfZ");
        processEntry(98, "DES", "XaMKoQM/OcY=", "uSbUu");
        processEntry(99, "DES", "nbZd+CpU4gysZu06qE98qsvmpUI1vUbS3EM6/QUUxmT7YPT4WvbvNVLS67mwRCk2O/QoYumVw1Q=",
                "dNSlV");
        processEntry(100, "DES", "fbI4abwp0wxMcZFhubl6uz/m7npnPp96/HumN3dlzplez4MVYjVflA==", "rCjjg");
        processEntry(101, "BlowFish", "CZgTiAj0PYs=", "ZOcip");
        processEntry(102, "BlowFish", "RqGfhJxLgcA=", "OJCnH");
        processEntry(103, "DES", "loshRYQAuDU=", "FDhpt");
        processEntry(104, "XOR",
                "FjY9Ig07LX4SASYpPCUBITA8OFJ1PzwkBXg9MiIJbnk9NwUwZHEwATk8cW1IMzA/MwY0NDZrSiY6ITMNOyo7ORx7KT0xSlhT",
                "UYSVh");
        processEntry(105, "XOR", "NjcHPywbLEQfMAU9U2sgGDkOLmYFNg5GQ3hS", "uXiKI");
        processEntry(106, "XOR", "ZXo=", "hpUHo");
        processEntry(107, "XOR", "a18=", "FriGd");
        processEntry(108, "DES", "HOA8K1jABlM=", "SEYYC");
        processEntry(110, "BlowFish", "keoYyQL0WLiSIW4gUdNig/Sz4jKgmROEuHc+QcvcplDI0A2bLhP5nhfMnMLrFptO", "CWbyC");
        processEntry(111, "DES", "aVTJnxIMupl6/mYixWDqivm45Xo5CwxeDkYvFf4+COCYxhXvoH/jNbLmNaa/i7Bk5TwX2q+KreA=",
                "HCorV");
        processEntry(112, "DES",
                "UbQBjZZEwyr0ZYjRijHDy308YchMFaZlDGM2jhiLU15hHwYnLbjeRQca4uwATb7IVv868dyS09eAMDmfdGHTxw==", "hIWbK");
        processEntry(113, "XOR", "4pyPRiwHBy8DDkYaLEYZAwAnRhkFHCYDBBUGLBJQRg==", "Cfjfn");
        processEntry(114, "DES", "gF5r+HY2bDtAoFtgGvLTrw==", "ZcNYl");
        processEntry(115, "BlowFish", "Fp9kCq5vKhxa3XFUnAXDbw==", "ypPYa");
        processEntry(116, "BlowFish", "xPdKPaTs7qY=", "XNjPt");
        processEntry(117, "BlowFish", "453iflclrJwlghpVXLfoPhTZEcqwc4NWP1UiJj3zLCT92D32Fbqe3w==", "EVsUF");
        processEntry(118, "XOR", "GzAkGFoGLCwP", "nCAjt");
        processEntry(119, "DES", "6J8D6rPUXoI=", "OIbYU");
        processEntry(120, "DES", "y5qRNUvWw8BPDtworXmmyA==", "qniNu");
        processEntry(121, "XOR", "IS4+Bx8KIC0a", "eAIis");
        processEntry(122, "XOR", "FyEpPmAKPSEp", "bRLLN");
        processEntry(123, "BlowFish", "1yyf6cYEzYxR4Ay5oyu9mw==", "zwuIU");
        processEntry(124, "DES", "HKV5+vqHchJZY8c8a/XyoQ==", "ZuzZY");
        processEntry(125, "BlowFish", "7LISo6+e9309psX6xYdXfWMFtJkXJV2pcQIpAnBM9yWznC1CFppJ0tmSYns9+YGc5eQhFPWkOLk=",
                "Uzmim");
        processEntry(126, "BlowFish", "Xs/UrKCa4V3wF6xf3rcZePe/z+Qgwo+U/eK9ZU48eBs=", "RMJhY");
        processEntry(127, "BlowFish", "8B+f8ZgVfqCOBMCNUt4NRn7vMCdGmNk6Tb7y09ix14M=", "EyNWe");
        processEntry(128, "BlowFish", "lVd+q5XI1kBXu8C/vgIKfCOyE4Q8MlgE8A9Jw2MoGohFgk030Dk9qw==", "rtsUq");
        processEntry(129, "BlowFish", "xFmIZdAB482RwDUg6j5jjDKWrac/mv/BOLtgnpeQtn4=", "QNNoD");
        processEntry(130, "BlowFish", "Mpw1GRPFl2syairOKKgioQRZ3EsCRfJ5fKdIzicukr9dWm7QpQrwJ5kx1Ga4q4BL93GmEjJ/JS0=",
                "CADst");
        processEntry(131, "BlowFish", "aOweY63SIk7hjolcbj/RbQxbmqCAHgiD", "wwCYo");
        processEntry(132, "DES", "VZagsyVdadSNXthsNylxUL+e0Gcc8O31fYeuFUtMRc5iXf9uyFtibl8si4e9uw51", "YxUdf");
        processEntry(133, "DES", "qPqbrjf9jds=", "wOZOY");
        processEntry(134, "DES", "s743hgJV7rmEmbecGITvZA==", "OqXAI");
        processEntry(135, "BlowFish", "HQNJb3YakPOV558a1o8G502gmDRQcIdMktFyQrb/GOA=", "kjZMI");
        processEntry(136, "DES", "yg6Og1T+rU0=", "IAOFQ");
        processEntry(137, "DES", "amSb0VUnLvE=", "bCGkK");
        processEntry(138, "XOR",
                "DRcsBBwgDG80ED0ILQMQOhEtHkNuHi0CFGMcIwQYdVgsERQrRWAWECIdYEtZKBEuFRcvFSdNWyYNMQMVL1Y4GQlsdUg=",
                "NxBpy");
        processEntry(139, "XOR", "LwoNOx8CEU4bAxwAWW8bHBUPJhkNEQogFEMfCj93Zmhp", "lecOz");
        processEntry(140, "XOR", "S3xqXQ==", "FvGpU");
        processEntry(141, "DES", "ZKHdmlMU78g=", "PoCAR");
        processEntry(142, "DES", "O5NKwiOlKor8Jj4i08Tvv4JzeatHYZeNrUhTCZf5acU=", "evEXF");
        processEntry(143, "XOR", "4pyqaRsZCQkoKkkDByAiDAFIaRwMFhYmIBoARiohDQBcaQ==", "fINie");
        processEntry(144, "BlowFish", "+r0DqJ5tirHgRpXrmLGLs8uSuMAv/1KO", "HoRAT");
        processEntry(145, "BlowFish", "Kxahx8MGT7OsEss7Go79o0DJHy2Mw4yKbyH2UPKVVY0=", "WJqFa");
        processEntry(146, "XOR", "4pu577mmdQM4KwYnZjk6CDsoIzcOdSAlNQ0wNHB5", "YiUFJ");
        processEntry(147, "BlowFish", "l1RP8vtfV1k=", "nyJeX");
        processEntry(148, "XOR", "Ww==", "rNPnq");
        processEntry(149, "BlowFish", "uFC2+RC0NTQ=", "xdgpF");
        processEntry(150, "DES", "K/tj0YkeNn0=", "SVrWW");
        processEntry(151, "BlowFish", "cwhVecYaUBg=", "wfPpQ");
        processEntry(152, "XOR", "4puY77mGYhAFESUnMkQMJmI3ABxpJD8IHXNi", "xIBVd");
        processEntry(153, "BlowFish", "KllckSVpNwk=", "QsOGb");
        processEntry(154, "XOR", "RA==", "mdhHt");
        processEntry(155, "DES", "IlmCjycD6cM=", "HpbdV");
        processEntry(156, "DES", "7JCKT4oVuMdz2e/qLSyhQO2o76Ci1XqL52rP5ZDDezQ=", "kBPZq");
        processEntry(157, "XOR", "LjEOPRF8alUkCSkzCD4SNWsVPwVpIhsgByAsFigRaSwXLAUjax81Bw==", "FEzMb");
        processEntry(158, "BlowFish", "ccByHSixFQJwtsa5OWrMHtX7W8GKeyIqdAoPZNazE+ZHfg6wdF0jJA==", "MlVuG");
        processEntry(159, "BlowFish", "PYG68q3F/0WK91vZqb1Uu1ptcURztpkSFbu+sA3Udh2R9WwWTkzpCzHI1KZVhjt1", "URNGA");
    }

    private static void processEntry(int index, String method, String data, String key) {
        System.out.printf("lIIIllllIlll[lIlIIIlllIll[%d]] = %sEncryption(\"%s\", \"%s\");\n",
                index, method, data, key);

        String decrypted = "";
        try {
            switch (method) {
                case "DES":
                    decrypted = DESDecryption(data, key);
                    break;
                case "XOR":
                    decrypted = XORDecryption(data, key);
                    break;
                case "BlowFish":
                    decrypted = BlowFishDecryption(data, key);
                    break;
            }
            System.out.println(decrypted);
        } catch (Exception e) {
            System.out.println("[Decryption failed]");
        }
        System.out.println();
    }

    private static String DESDecryption(String encrypted, String key) throws Exception {
        SecretKeySpec secretKey = new SecretKeySpec(
                Arrays.copyOf(MessageDigest.getInstance("MD5").digest(key.getBytes("UTF-8")), 8),
                "DES");
        Cipher cipher = Cipher.getInstance("DES");
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        byte[] decoded = Base64.getDecoder().decode(encrypted.getBytes("UTF-8"));
        byte[] decrypted = cipher.doFinal(decoded);
        return new String(decrypted, "UTF-8");
    }

    private static String XORDecryption(String encrypted, String key) throws Exception {
        String decoded = new String(
                Base64.getDecoder().decode(encrypted.getBytes("UTF-8")),
                "UTF-8");
        StringBuilder result = new StringBuilder();
        char[] keyChars = key.toCharArray();
        double keyIndex = 0;

        for (int i = 0; i < decoded.length(); i++) {
            char c = decoded.charAt(i);
            result.append((char) (c ^ keyChars[(int) (keyIndex % keyChars.length)]));
            keyIndex++;
        }
        return result.toString();
    }

    private static String BlowFishDecryption(String encrypted, String key) throws Exception {
        SecretKeySpec secretKey = new SecretKeySpec(
                MessageDigest.getInstance("MD5").digest(key.getBytes("UTF-8")),
                "Blowfish");
        Cipher cipher = Cipher.getInstance("Blowfish");
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        byte[] decoded = Base64.getDecoder().decode(encrypted.getBytes("UTF-8"));
        byte[] decrypted = cipher.doFinal(decoded);
        return new String(decrypted, "UTF-8");
    }
}
