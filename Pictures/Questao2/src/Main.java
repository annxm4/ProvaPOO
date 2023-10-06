public class Main {
    public static void main(String[] args) {
        DistribuicaoAlimento da = new DistribuicaoAlimento("Geladeira SP","SESC","Sao Paulo","01/02/2023","30/09/2023","Arroz",10);
        TrabalhoVoluntario tv = new TrabalhoVoluntario("Geladeira RJ","SESC","RJ","17/01/2023","30/09/2023","Feijak",6);

        System.out.println("\nDistribuição de alimento\n" + da.imprimeProjeto());
        System.out.println("\nTrabalho voluntario\n" + tv.imprimeProjeto());

    }
}
