package com.br.cadastrodealunosuezo;

import java.util.ArrayList;
import java.util.Map;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class ListarFragment extends Fragment {
	
	ListView listView;
	CursorAdapter adapter;
	
	public ListarFragment(){
		
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {		
		View rootView = inflater.inflate(R.layout.listar_aluno_layout, container, false);
		
		ArrayList<Map<String,String>> lista = new WebServiceHandler().getListaAluno();
		SimpleAdapter ad = new SimpleAdapter(getActivity(),lista,R.layout.alunos_layout,new String[] {"nome","email"}, new int[]{R.alunos.nome, R.alunos.email});		
		
		listView= (ListView) rootView.findViewById(R.list.listaAlunos);
		//listView.setAdapter(ad);
		
		return rootView;
	}	
	
}