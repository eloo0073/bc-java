module org.bouncycastle.provider
{
    requires java.sql;
    requires java.naming;

    provides java.security.Provider with org.bouncycastle.jce.provider.BouncyCastleProvider,org.bouncycastle.pqc.jcajce.provider.BouncyCastlePQCProvider;

    opens org.bouncycastle.jcajce.provider.asymmetric.edec to java.base;
    opens org.bouncycastle.pqc.jcajce.provider.qtesla to java.base;
    opens org.bouncycastle.pqc.jcajce.provider.lms to java.base;

    exports org.bouncycastle;
    exports org.bouncycastle.asn1;
    exports org.bouncycastle.asn1.anssi;
    exports org.bouncycastle.asn1.bc;
    exports org.bouncycastle.asn1.cryptopro;
    exports org.bouncycastle.asn1.edec;
    exports org.bouncycastle.asn1.gm;
    exports org.bouncycastle.asn1.gnu;
    exports org.bouncycastle.asn1.iana;
    exports org.bouncycastle.asn1.isara;
    exports org.bouncycastle.asn1.iso;
    exports org.bouncycastle.asn1.kisa;
    exports org.bouncycastle.asn1.microsoft;
    exports org.bouncycastle.asn1.misc;
    exports org.bouncycastle.asn1.mozilla;
    exports org.bouncycastle.asn1.nist;
    exports org.bouncycastle.asn1.nsri;
    exports org.bouncycastle.asn1.ntt;
    exports org.bouncycastle.asn1.ocsp;
    exports org.bouncycastle.asn1.oiw;
    exports org.bouncycastle.asn1.pkcs;
    exports org.bouncycastle.asn1.rosstandart;
    exports org.bouncycastle.asn1.sec;
    exports org.bouncycastle.asn1.teletrust;
    exports org.bouncycastle.asn1.ua;
    exports org.bouncycastle.asn1.util;
    exports org.bouncycastle.asn1.x500;
    exports org.bouncycastle.asn1.x500.style;
    exports org.bouncycastle.asn1.x509;
    exports org.bouncycastle.asn1.x509.qualified;
    exports org.bouncycastle.asn1.x509.sigi;
    exports org.bouncycastle.asn1.x9;
    exports org.bouncycastle.crypto;
    exports org.bouncycastle.crypto.agreement;
    exports org.bouncycastle.crypto.agreement.jpake;
    exports org.bouncycastle.crypto.agreement.kdf;
    exports org.bouncycastle.crypto.agreement.srp;
    exports org.bouncycastle.crypto.commitments;
    exports org.bouncycastle.crypto.digests;
    exports org.bouncycastle.crypto.ec;
    exports org.bouncycastle.crypto.encodings;
    exports org.bouncycastle.crypto.engines;
    exports org.bouncycastle.crypto.examples;
    exports org.bouncycastle.crypto.generators;
    exports org.bouncycastle.crypto.io;
    exports org.bouncycastle.crypto.kems;
    exports org.bouncycastle.crypto.macs;
    exports org.bouncycastle.crypto.modes;
    exports org.bouncycastle.crypto.modes.gcm;
    exports org.bouncycastle.crypto.modes.kgcm;
    exports org.bouncycastle.crypto.paddings;
    exports org.bouncycastle.crypto.params;
    exports org.bouncycastle.crypto.parsers;
    exports org.bouncycastle.crypto.prng;
    exports org.bouncycastle.crypto.prng.drbg;
    exports org.bouncycastle.crypto.signers;
    exports org.bouncycastle.crypto.util;
    exports org.bouncycastle.i18n;
    exports org.bouncycastle.i18n.filter;
    exports org.bouncycastle.iana;
    exports org.bouncycastle.jcajce;
    exports org.bouncycastle.jcajce.io;
    exports org.bouncycastle.jcajce.provider.asymmetric;
    exports org.bouncycastle.jcajce.provider.asymmetric.dh;
    exports org.bouncycastle.jcajce.provider.asymmetric.dsa;
    exports org.bouncycastle.jcajce.provider.asymmetric.dstu;
    exports org.bouncycastle.jcajce.provider.asymmetric.ec;
    exports org.bouncycastle.jcajce.provider.asymmetric.ecgost;
    exports org.bouncycastle.jcajce.provider.asymmetric.ecgost12;
    exports org.bouncycastle.jcajce.provider.asymmetric.elgamal;
    exports org.bouncycastle.jcajce.provider.asymmetric.gost;
    exports org.bouncycastle.jcajce.provider.asymmetric.ies;
    exports org.bouncycastle.jcajce.provider.asymmetric.rsa;
    exports org.bouncycastle.jcajce.provider.asymmetric.util;
    exports org.bouncycastle.jcajce.provider.asymmetric.x509;
    exports org.bouncycastle.jcajce.provider.config;
    exports org.bouncycastle.jcajce.provider.digest;
    exports org.bouncycastle.jcajce.provider.drbg;
    exports org.bouncycastle.jcajce.provider.keystore;
    exports org.bouncycastle.jcajce.provider.keystore.bc;
    exports org.bouncycastle.jcajce.provider.keystore.bcfks;
    exports org.bouncycastle.jcajce.provider.keystore.pkcs12;
    exports org.bouncycastle.jcajce.provider.symmetric;
    exports org.bouncycastle.jcajce.provider.symmetric.util;
    exports org.bouncycastle.jcajce.provider.util;
    exports org.bouncycastle.jcajce.interfaces;
    exports org.bouncycastle.jcajce.spec;
    exports org.bouncycastle.jcajce.util;
    exports org.bouncycastle.jce;
    exports org.bouncycastle.jce.exception;
    exports org.bouncycastle.jce.interfaces;
    exports org.bouncycastle.jce.netscape;
    exports org.bouncycastle.jce.provider;
    exports org.bouncycastle.jce.spec;
    exports org.bouncycastle.math;
    exports org.bouncycastle.math.ec;
    exports org.bouncycastle.math.ec.custom.djb;
    exports org.bouncycastle.math.ec.custom.gm;
    exports org.bouncycastle.math.ec.custom.sec;
    exports org.bouncycastle.math.ec.endo;
    exports org.bouncycastle.math.ec.rfc7748;
    exports org.bouncycastle.math.ec.rfc8032;
    exports org.bouncycastle.math.ec.tools;
    exports org.bouncycastle.math.field;
    exports org.bouncycastle.math.raw;
    exports org.bouncycastle.pqc.asn1;
    exports org.bouncycastle.pqc.crypto;
    exports org.bouncycastle.pqc.crypto.cmce;
    exports org.bouncycastle.pqc.crypto.frodo;
    exports org.bouncycastle.pqc.crypto.gmss;
    exports org.bouncycastle.pqc.crypto.gmss.util;
    exports org.bouncycastle.pqc.crypto.lms;
    exports org.bouncycastle.pqc.crypto.mceliece;
    exports org.bouncycastle.pqc.crypto.newhope;
    exports org.bouncycastle.pqc.crypto.ntru;
    exports org.bouncycastle.pqc.crypto.qtesla;
    exports org.bouncycastle.pqc.crypto.rainbow;
    exports org.bouncycastle.pqc.crypto.rainbow.util;
    exports org.bouncycastle.pqc.crypto.saber; 
    exports org.bouncycastle.pqc.crypto.sphincs;
    exports org.bouncycastle.pqc.crypto.sphincsplus;
    exports org.bouncycastle.pqc.crypto.util;
    exports org.bouncycastle.pqc.crypto.xmss;
    exports org.bouncycastle.pqc.jcajce.interfaces;
    exports org.bouncycastle.pqc.jcajce.provider;
    exports org.bouncycastle.pqc.jcajce.provider.cmce;
    exports org.bouncycastle.pqc.jcajce.provider.frodo;
    exports org.bouncycastle.pqc.jcajce.provider.gmss;
    exports org.bouncycastle.pqc.jcajce.provider.mceliece;
    exports org.bouncycastle.pqc.jcajce.provider.newhope;
    exports org.bouncycastle.pqc.jcajce.provider.rainbow;
    exports org.bouncycastle.pqc.jcajce.provider.saber;
    exports org.bouncycastle.pqc.jcajce.provider.sphincs;
    exports org.bouncycastle.pqc.jcajce.provider.sphincsplus; 
    exports org.bouncycastle.pqc.jcajce.provider.util;
    exports org.bouncycastle.pqc.jcajce.provider.xmss;
    exports org.bouncycastle.pqc.jcajce.spec;
    exports org.bouncycastle.pqc.math.linearalgebra;
    exports org.bouncycastle.pqc.math.ntru.euclid;
    exports org.bouncycastle.pqc.math.ntru.polynomial;
    exports org.bouncycastle.pqc.math.ntru.util;
    exports org.bouncycastle.util;
    exports org.bouncycastle.util.encoders;
    exports org.bouncycastle.util.io;
    exports org.bouncycastle.util.io.pem;
    exports org.bouncycastle.util.test;
    exports org.bouncycastle.x509;
    exports org.bouncycastle.x509.extension;
    exports org.bouncycastle.x509.util;
}
