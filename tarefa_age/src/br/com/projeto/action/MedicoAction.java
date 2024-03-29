package br.com.projeto.action;

import java.util.List;

import com.opensymphony.xwork2.Action;

import br.com.projeto.dao.MedicoDao;
import br.com.projeto.entity.Medico;

public class MedicoAction implements Action {

	private Medico medico;

	private List<Medico> medicos;

	@Override
	public String execute() throws Exception {

		this.medicos = new MedicoDao().findAll();

		return "success";
	}

	/**
	 * M�todo que redireciona para a tela de formul�rio.
	 */
	public String telaForm() {
		return "form";
	}

	/**
	 * M�todo que cadastra ou edita um m�dico.
	 */
	public String salvar() throws Exception {

		try {

			if (medico.getId() != null) {

				// Atualizar
				if (!medico.getCrm().equals("") && !medico.getNome().equals("") && !medico.getCpf().equals("")) {
					new MedicoDao().update(medico);
				}

			} else {

				// Cadastrar

				if (!medico.getCrm().equals("") && !medico.getNome().equals("") && !medico.getCpf().equals("")) {
					new MedicoDao().create(medico);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return "redirectSuccess";
	}

	/**
	 * M�todo que realiza a exclus�o l�gica de um m�dico.
	 */
	public String remover() throws Exception {

		try {

			new MedicoDao().exclusaoLogica(medico.getId());

		} catch (Exception e) {
			e.printStackTrace();
		}

		return "redirectSuccess";

	}

	// Getters and Setters

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public List<Medico> getMedicos() {
		return medicos;
	}

	public void setMedicos(List<Medico> medicos) {
		this.medicos = medicos;
	}

}
