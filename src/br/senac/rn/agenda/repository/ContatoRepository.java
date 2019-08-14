package br.senac.rn.agenda.repository;

import br.senac.rn.agenda.model.Contato;

import java.util.ArrayList;
import java.util.List;

public class ContatoRepository {

    private static Long id = 0L;
    private static List<Contato> contatos = new ArrayList<Contato>();

    public void salva(Contato contato) {
        id++;
        contato.setId(id);
        contatos.add(contato);
    }

    public List<Contato> buscaTodos (){
        List<Contato> copiaContatos = new ArrayList<Contato>(contatos);
        return copiaContatos;
    }

    public Contato buscaPeloNome(String michele_silva, String id) {
        for (Contato contato : contatos) {
            if (contato.getNome().equals(id)) {
                return contato;
            }
        }
        return null;
    }

    public void remove(Contato contato) {
        contatos.remove(contato);
    }

    public void edita(Contato contatoAtual, Contato contaNova) {
        for (Contato c: contatos) {
            if (c.getId().equals(contato.getId())) {
                int indice = contatos.indexOf(c);
                contatos.set(indice, contatos);
            }
        }
    }

}
