package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //atributo
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Maria", 123456);
        agendaContatos.adicionarContato("Maria", 5665);
        agendaContatos.adicionarContato("Maria Silva", 111111);
        agendaContatos.adicionarContato("Maria DIO", 654987);
        agendaContatos.adicionarContato("Camila Santos", 11111);
        agendaContatos.adicionarContato("Maria ", 4444);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Camila Santos");
        agendaContatos.exibirContatos();

        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Maria DIO"));
    }
}
