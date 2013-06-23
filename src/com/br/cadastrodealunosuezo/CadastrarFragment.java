package com.br.cadastrodealunosuezo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class CadastrarFragment extends Fragment{
	
	EditText nome, end, tel, email;
	
	public CadastrarFragment(){
		
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.activity_cadastro_fragment, container, false);
		Button btnCadastar = (Button) rootView.findViewById(R.cad.btnCadastra);
		nome = (EditText) rootView.findViewById(R.cad.nome);
		end  = (EditText) rootView.findViewById(R.cad.end);
		tel = (EditText) rootView.findViewById(R.cad.tel);
		email = (EditText) rootView.findViewById(R.cad.email);
		
				
		btnCadastar.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Aluno al = new Aluno(nome.toString(),end.toString(),tel.toString(),email.toString());
				new WebServiceHandler().cadastrarAluno(al);
				
			}
		});
						
		return rootView;
	}

}
