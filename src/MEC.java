public class MEC {

    public void imprimeUniversidades(Universidade[] arrayUniversidade) {
        for (int i = 0; i < arrayUniversidade.length; i++) {
            System.out.println("--------------");
            if (arrayUniversidade[i] instanceof Publica) {
                arrayUniversidade[i].imprimeInfo();
                System.out.println("A universidade é pública");
            } else if (arrayUniversidade[i] instanceof Privada) {
                arrayUniversidade[i].imprimeInfo();
                System.out.println("A universidade é privada");
            } else if (arrayUniversidade[i] instanceof Universidade) {
                arrayUniversidade[i].imprimeInfo();
            }
        }
    }
    public void maisCara(Universidade[] arrayUniversidade) {
        double cara = 0;
        Privada maisCara = null;
        for (int i = 0; i < arrayUniversidade.length; i++) {
            if(arrayUniversidade[i] instanceof Privada) {
                if (((Privada)arrayUniversidade[i]).getValorMensalidade() > cara) {
                    cara = ((Privada) arrayUniversidade[i]).getValorMensalidade();
                    maisCara = (Privada) arrayUniversidade[i];
                }
            }
        }
        maisCara.imprimeInfo();
    }

    public void universidadesDoSul(Universidade[] arrayUniversidade) {
        for (int i = 0; i < arrayUniversidade.length; i++) {
            if (arrayUniversidade[i] instanceof Publica) {
                if (((Publica) arrayUniversidade[i]).getEstado().equalsIgnoreCase("RS") ||
                        ((Publica) arrayUniversidade[i]).getEstado().equalsIgnoreCase("SC") ||
                        ((Publica) arrayUniversidade[i]).getEstado().equalsIgnoreCase("PR")) {
                    arrayUniversidade[i].imprimeInfo();
                    System.out.println("--------------");
                }
            }
        }
    }


}
