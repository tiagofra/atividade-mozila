import java.util.Stack;

public class Navegador {
    private Stack<String> pilhaVoltar; // Pilha para armazenar páginas anteriores
    private Stack<String> avancarPilha; // Pilha para armazenar páginas futuras
    private String paginaAtual; // Página atualmente aberta

    public Navegador() {
        this.pilhaVoltar = new Stack<>();
        this.avancarPilha = new Stack<>();
        this.paginaAtual = null;
    }

    // Método para navegar para uma nova página
    public void acessarPag(String novaPagina) {
        if (paginaAtual != null) {
            pilhaVoltar.push(paginaAtual); // Adiciona a página atual à pilha de voltar
        }
        paginaAtual = novaPagina; // Define a nova página como atual
        avancarPilha.clear(); // Limpa a pilha de avançar ao acessar uma nova página
        exibirEstado();
    }

    // Método para voltar para a página anterior
    public void voltar() {
        if (!pilhaVoltar.isEmpty()) {
            avancarPilha.push(paginaAtual); // Salva a página atual na pilha de avançar
            paginaAtual = pilhaVoltar.pop(); // Recupera a página anterior
        }
        exibirEstado();
    }

    // Método para avançar para a próxima página
    public void avancar() {
        if (!avancarPilha.isEmpty()) {
            pilhaVoltar.push(paginaAtual); // Salva a página atual na pilha de voltar
            paginaAtual = avancarPilha.pop(); // Recupera a próxima página
        }
        exibirEstado();
    }

    // Método para exibir o estado atual do navegador
    private void exibirEstado() {
        System.out.println("Página atual: " + (paginaAtual != null ? paginaAtual : "Nenhuma"));
        System.out.println("Voltar: " + (!pilhaVoltar.isEmpty()));
        System.out.println("Avançar: " + (!avancarPilha.isEmpty()));
    }

    public static void main(String[] args) {
        Navegador nav = new Navegador();
        for (String pagina : new String[]{"x.com", "facebook.com", "ulife.com.br"}) { // Lista de sites que serão verificados
            nav.acessarPag(pagina);
        }
        nav.voltar();
        nav.avancar();
    }
}