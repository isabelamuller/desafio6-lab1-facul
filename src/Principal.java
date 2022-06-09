import java.util.Scanner;
    public class Principal {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Indique o número de universidades que você deseja criar: ");
            int numPosicoes = sc.nextInt();
            sc.nextLine();
            Universidade[] arrayUniversidade = new Universidade[numPosicoes];
            for (int i = 0; i < arrayUniversidade.length; i++) {
                System.out.println("A universidade que você deseja inserir é pública ou privada?");
                String pubOuPriv = sc.nextLine();
                System.out.println("Nome da uni: ");
                String nome = sc.nextLine();
                System.out.println("Quantidade de alunos: ");
                int quantAlunos = sc.nextInt();
                sc.nextLine();
                System.out.println("Quantidade de profs: ");
                int quantProfessores = sc.nextInt();
                sc.nextLine();
                if (pubOuPriv.equals("privada")) {
                    System.out.println("Insira o valor da mensalidade: ");
                    double valorMensalidade = sc.nextDouble();
                    sc.nextLine();
                    Privada priv = new Privada(nome, quantAlunos, quantProfessores, valorMensalidade);
                    arrayUniversidade[i] = priv;
                } else if (pubOuPriv.equals("publica")) {
                    System.out.println("Cidade onde fica a uni: ");
                    String cidade = sc.nextLine();
                    System.out.println("Estado em que fica a uni: ");
                    String estado = sc.nextLine();
                    Publica pub = new Publica(nome, quantAlunos, quantProfessores, estado, cidade);
                    arrayUniversidade[i] = pub;
                }
            }
            MEC mec1 = new MEC();
            mec1.imprimeUniversidades(arrayUniversidade);
            System.out.println("--------------");
            System.out.println("A UNIVERSIDADE MAIS CARA É:");
            mec1.maisCara(arrayUniversidade);
            System.out.println("--------------");
            System.out.println("UNIVERSIDADES DO SUL:");
            mec1.universidadesDoSul(arrayUniversidade);

        }
    }