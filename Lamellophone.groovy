package tarumanagara

class Lamellophone {

    private tanggal = new Date()

    private logam = [
       j2: "HgHg PuFe ____ ____ CuNp PbAu ____ AuPb ____ AgUr ____ FePu ",
       j3: "HgSn ____ SnHg UrFe ____ PbAg ____ AuAu ____ AgPb ____ FeUr ",
       j5: "PbCu ____ AuSn ____ AgHg TiFe FeTi ____ ____ SnAu ____ CuPb ",
       j6: "HgAu ____ SnPb ____ CuUr PbSn ____ AuHg NpFe ____ ____ FeNp ",
       k1: "____ FeUr HgSn ____ SnHg UrFe ____ PbAg ____ AuAu ____ AgPb ",
       k2: "NpCu ____ ____ FePu HgHg PuFe ____ UrAg ____ PbAu ____ AuPb ",
       k5: "UrCu ____ PbSn ____ AuHg NpFe ____ ____ FeNp HgAu ____ SnPb ",
       k6: "HgAg ____ SnAu ____ CuPb PbCu ____ AuSn ____ ____ TiFe FeTi ",
       n0: "HgCu ____ SnSn ____ CuHg PbFe ____ AuAg ____ AgAu ____ FePb ",
      j17: "____ ____ SnAu ____ CuPb PbCu ____ AuSn ____ AgHg TiFe FeTi ",
      j23: "HgHg PuFe ____ UrAg ____ PbAu ____ AuPb ____ AgUr ____ FePu ",
      j25: "FeCu HgMn ____ ____ MnHg CuFe PbTi ____ ____ NpAu ____ TiPb ",
      j26: "HgHg PuFe ____ ____ CuNp PbAu ____ AuPb NpCu ____ ____ FePu ",
      j36: "HgAu ____ SnPb UrCu ____ PbSn ____ AuHg NpFe ____ ____ FeNp ",
      j56: "UrCu ____ PbSn ____ AuHg NpFe AgTi ____ FeNp ____ ____ SnPb ",
      k12: "____ AgUr ____ FePu HgHg PuFe ____ UrAg ____ PbAu ____ AuPb ",
      k15: "____ CuUr PbSn ____ AuHg NpFe ____ ____ FeNp HgAu ____ SnPb ",
      k25: "NpCu ____ ____ FePu HgHg PuFe ____ ____ CuNp PbAu ____ AuPb ",
      k26: "HgMn ____ ____ MnHg CuFe PbTi ____ AuNp ____ ____ TiPb FeCu ",
      k34: "PbCu ____ AuSn ____ ____ TiFe FeTi HgAg ____ SnAu ____ CuPb ",
      k56: "HgAu ____ SnPb ____ CuUr PbSn ____ ____ NpFe ____ TiAg FeNp ",
     j236: "HgHg PuFe ____ UrAg ____ PbAu ____ AuPb NpCu ____ ____ FePu ",
     j256: "FeCu HgMn ____ ____ MnHg CuFe PbTi ____ AuNp ____ ____ TiPb ",
     j2k5: "FeCu HgMn ____ ____ MnHg CuFe ____ ____ AuNp NpAu ____ TiPb ",
     j2k6: "HgHg PuFe ____ ____ CuNp PbAu ____ AuPb ____ ____ TiSn FePu ",
     j2y3: "HgHg PuFe SnTi ____ ____ PbAu ____ AuPb ____ AgUr ____ FePu ",
     j3k5: "NpCu ____ TiSn FePu ____ PuFe ____ ____ CuNp PbAu ____ AuPb ",
     j3k6: "HgTi ____ SnNp UrAu ____ PbPb ____ AuUr ____ ____ TiHg FeFe ",
     j5y6: "PbCu ____ AuSn ____ AgHg TiFe FeTi HgAg ____ ____ ____ CuPb ",
     k125: "____ AgUr ____ FePu HgHg PuFe ____ ____ CuNp PbAu ____ AuPb ",
     k1j5: "____ AuUr NpSn ____ TiHg FeFe HgTi ____ ____ UrAu ____ PbPb ",
     k1j6: "____ PuFe SnTi ____ CuNp PbAu ____ AuPb NpCu ____ ____ FePu ",
     k256: "HgMn ____ ____ MnHg CuFe PbTi ____ ____ NpAu ____ TiPb FeCu ",
     k2j5: "NpCu ____ ____ FePu HgHg PuFe SnTi ____ ____ PbAu ____ AuPb ",
     k2j6: "HgMn ____ ____ MnHg CuFe PbTi ____ AuNp NpAu ____ ____ FeCu ",
     k2x1: "____ ____ TiSn FePu HgHg PuFe ____ UrAg ____ PbAu ____ AuPb ",
     k6x5: "HgAg ____ SnAu ____ CuPb PbCu ____ ____ ____ AgHg TiFe FeTi ",
     n167: "NpCu ____ ____ FePu ____ PuFe SnTi ____ CuNp PbAu ____ AuPb ",
     n345: "____ PuFe ____ ____ CuNp PbAu ____ AuPb NpCu ____ TiSn FePu ",
     n5y2: "HgMn ____ ____ MnHg CuFe ____ ____ AuNp NpAu ____ TiPb FeCu ",
     n6x2: "FeCu HgMn ____ ____ MnHg CuFe PbTi ____ AuNp NpAu ____ ____ ",
    j17k2: "____ ____ ____ MnFe CuTi PbAg ____ AuAu ____ AgPb TiCu FeMn ",
    j17y2: "HgAg ____ ____ ____ CuPb PbCu ____ AuSn ____ AgHg TiFe FeTi ",
    j23k6: "HgHg PuFe ____ UrAg ____ PbAu ____ AuPb ____ ____ TiSn FePu ",
    j25y6: "TiCu FeMn ____ ____ SnHg MnFe CuTi PbAg ____ ____ ____ AgPb ",
    j26y3: "HgHg PuFe SnTi ____ ____ PbAu ____ AuPb NpCu ____ ____ FePu ",
    j2k34: "TiCu FeMn ____ ____ ____ MnFe CuTi PbAg ____ AuAu ____ AgPb ",
    j2k56: "HgHg PuFe ____ ____ CuNp PbAu ____ ____ NpCu ____ TiSn FePu ",
    j34k6: "HgSn ____ SnHg MnFe CuTi ____ ____ AuAu ____ ____ TiCu FeMn ",
    j56y7: "UrCu ____ PbSn ____ AuHg NpFe AgTi ____ FeNp HgAu ____ ____ ",
    k12j5: "____ AgUr ____ FePu HgHg PuFe SnTi ____ ____ PbAu ____ AuPb ",
    k17j5: "TiCu FeMn HgSn ____ SnHg MnFe CuTi ____ ____ AuAu ____ ____ ",
    k25x1: "____ ____ TiSn FePu HgHg PuFe ____ ____ CuNp PbAu ____ AuPb ",
    k26x5: "HgSn ____ ____ MnFe CuTi PbAg ____ ____ ____ AgPb TiCu FeMn ",
    k2j56: "NpCu ____ ____ FePu HgHg PuFe SnTi ____ CuNp ____ ____ AuPb ",
    k34x2: "PbCu ____ ____ ____ AgHg TiFe FeTi HgAg ____ SnAu ____ CuPb ",
    k56x4: "HgAu ____ SnPb ____ CuUr ____ ____ AuHg NpFe ____ TiAg FeNp ",
    n25x6: "TiCu FeMn HgSn ____ ____ MnFe CuTi PbAg ____ ____ ____ AgPb ",
    n26y5: "____ ____ SnHg MnFe CuTi PbAg ____ ____ ____ AgPb TiCu FeMn ",
    n45y2: "HgTi ____ ____ UrAu ____ PbPb ____ AuUr NpSn ____ TiHg FeFe ",
    n67x2: "____ AuUr ____ ____ TiHg FeFe HgTi ____ SnNp UrAu ____ PbPb ",
   j136y7: "____ ____ SnPb UrCu ____ PbSn ____ AuHg NpFe AgTi ____ FeNp ",
   j167y2: "HgAu ____ ____ ____ CuUr PbSn ____ AuHg NpFe ____ TiAg FeNp ",
   j246y3: "HgHg PuFe SnTi ____ CuNp ____ ____ AuPb NpCu ____ ____ FePu ",
   j26y34: "HgHg PuFe SnTi UrAg ____ ____ ____ AuPb NpCu ____ ____ FePu ",
   j2k6x5: "HgHg PuFe ____ ____ CuNp PbAu ____ ____ ____ AgUr TiSn FePu ",
   j2k6y3: "HgHg PuFe SnTi ____ ____ PbAu ____ AuPb ____ ____ TiSn FePu ",
   j346y5: "NpCu ____ TiSn FePu HgHg PuFe ____ ____ CuNp ____ ____ AuPb ",
   j3k5x4: "HgAu ____ SnPb UrCu ____ ____ ____ AuHg NpFe AgTi ____ FeNp ",
   k135x4: "____ CuUr PbSn ____ ____ NpFe ____ TiAg FeNp HgAu ____ SnPb ",
   k157x6: "HgHg PuFe SnTi ____ CuNp PbAu ____ ____ NpCu ____ ____ FePu ",
   k1j6y7: "____ CuUr PbSn ____ AuHg NpFe ____ TiAg FeNp HgAu ____ ____ ",
   k257x1: "NpCu ____ TiSn FePu HgHg PuFe ____ ____ CuNp PbAu ____ ____ ",
   k25x17: "____ AgUr TiSn FePu HgHg PuFe ____ ____ CuNp PbAu ____ ____ ",
   k2j5x1: "____ ____ TiSn FePu HgHg PuFe SnTi ____ ____ PbAu ____ AuPb ",
   k2j5y6: "NpCu ____ ____ FePu HgHg PuFe SnTi UrAg ____ ____ ____ AuPb ",
   k345x2: "UrCu ____ ____ ____ AuHg NpFe AgTi ____ FeNp HgAu ____ SnPb ",
   n167x4: "HgAu ____ ____ UrCu ____ PbSn ____ AuHg NpFe AgTi ____ FeNp ",
   n345y7: "____ CuUr ____ ____ AuHg NpFe ____ TiAg FeNp HgAu ____ SnPb ",
  j2k56x4: "HgHg PuFe ____ ____ CuNp ____ ____ AuPb NpCu ____ TiSn FePu ",
  j3k56x4: "HgTi ____ SnNp UrAu ____ ____ ____ AuUr NpSn ____ TiHg FeFe ",
  k1j56y7: "____ AuUr NpSn ____ TiHg FeFe HgTi ____ SnNp UrAu ____ ____ ",
  k2j56y7: "NpCu ____ ____ FePu HgHg PuFe SnTi ____ CuNp PbAu ____ ____ "]


    def Bj(tali) {
        return tali.substring(50, 60) + tali.substring( 0, 50);
    }

    def Fn(tali) {
        return tali.substring(25, 60) + tali.substring( 0, 25);
    }

    def Cn(tali) {
        return tali.substring( 0, 60);
    }

    def Gn(tali) {
        return tali.substring(35, 60) + tali.substring( 0, 35);
    }

    def Dn(tali) {
        return tali.substring(10, 60) + tali.substring( 0, 10);
    }

    def An(tali) {
        return tali.substring(45, 60) + tali.substring( 0, 45);
    }

    def En(tali) {
        return tali.substring(20, 60) + tali.substring( 0, 20);
    }

    def Bn(tali) {
        return tali.substring(55, 60) + tali.substring( 0, 55);
    }

    def Fk(tali) {
        return tali.substring(30, 60) + tali.substring( 0, 30);
    }


    def gitar(tombol="z0", wektu='0', tali=("____ " * 12)) {
        String[] agordo = [
            this.En(tali),
            this.Bn(tali),
            this.Gn(tali),
            this.Dn(tali),
            this.An(tali),
            this.En(tali)
        ]
        println('\t' + tombol + "-gitar-sv" + wektu)
        for (int i = 0; i < agordo.size(); i++) {
            println('\t' + agordo[i])
        }
 
    }


    def biola(tombol="z0", wektu='0', tali=("____ " * 12)) {
        String[] agordo = [ 
            this.En(tali),
            this.An(tali),
            this.Dn(tali),
            this.Gn(tali),
            this.Cn(tali)
        ]
        println('\t' + tombol + "-biola-sv" + wektu)
        for (int i = 0; i < agordo.size(); i++) {
            println('\t' + agordo[i])
        }
    }


    def pilihan(dhaptar) {
        int siklus = 1
        for (int i = 0; i < dhaptar.size(); i++) {
            print '\t' + dhaptar[i]
            if (siklus % 7 == 0) {
                print '\n'
            } 
            siklus++ 
        }
        println('\n')
    }


    static main(String[] args) {

        Lamellophone obyek = new Lamellophone()

        try {

            String[] dhaptar = obyek.logam.keySet().sort()
            String wektu = obyek.tanggal.getTime()
            String tombol = "n0"

            if (args.length > 0 && args[0].length() < 9) {
                if (obyek.logam.containsKey(args[0])) {
                    tombol = args[0]
                }
                else {
                    String[] naga = []
                    switch (args[0]) {
                        case 'n':
                            naga = dhaptar.toList().subList(72, 83)
                            println()
                            obyek.pilihan(naga)
                            return null
                            break
                        case 'j':
                            naga = dhaptar.toList().subList( 0, 37)
                            println()
                            obyek.pilihan(naga)
                            return null
                            break
                        case 'k':
                            naga = dhaptar.toList().subList(37, 72)
                            println()
                            obyek.pilihan(naga)
                            return null
                            break
                        case 'x':
                            def xArr = []
                            for (int i = 0; i < dhaptar.size(); i++) {
                                if (dhaptar[i] ==~ '^.+x.+$') {
                                  xArr.add(dhaptar[i])
                                }
                            }
                            println()
                            obyek.pilihan(xArr)
                            return null
                            break
                        case ~'y':
                            def yArr = []
                            for (int i = 0; i < dhaptar.size(); i++) {
                                if (dhaptar[i] ==~ '^.+y.+$') {
                                  yArr.add(dhaptar[i])
                                }
                            }
                            println()
                            obyek.pilihan(yArr)
                            return null
                            break
                        case '\u0020'..'\u00FF':
                            println()
                            obyek.pilihan(dhaptar)
                            return null
                            break
                        default:
                            println()
                            obyek.pilihan(dhaptar)
                            return null
                    }
                }
            }
            else {
                println()
                obyek.pilihan(dhaptar)
                return null
            }

            String tali = obyek.logam[tombol]

            println('\n')
            obyek.gitar(tombol, wektu, tali)
            println('\n')
            obyek.biola(tombol, wektu, tali)
            println('\n')

        } 

        catch(MissingPropertyException e) {
            println(e.getMessage())
        }

        catch(MissingMethodException e) {
            println(e.getMessage())
        }

        catch(IndexOutOfBoundsException e) {
            println(e.getMessage())
        }

        finally {
            obyek = null
        } 

    }

}

