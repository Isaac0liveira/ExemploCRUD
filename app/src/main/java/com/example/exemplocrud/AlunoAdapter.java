package com.example.exemplocrud;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class AlunoAdapter extends BaseAdapter {

    private List<Aluno> alunos;
    private Activity activity;

    public AlunoAdapter(List<Aluno> alunos, Activity activity){
        super();
        this.alunos = alunos;
        this.activity = activity;
    }
    @Override
    public int getCount() {
        return alunos.size();
    }

    @Override
    public Object getItem(int position) {
        return alunos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return alunos.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        @SuppressLint("ViewHolder") View view = activity.getLayoutInflater().inflate(R.layout.item, parent, false);
        TextView nome = view.findViewById(R.id.txtNome);
        TextView telefone = view.findViewById(R.id.txtTelefone);
        TextView cpf = view.findViewById(R.id.txtCpf);
        Aluno a = alunos.get(position);
        nome.setText(a.getNome());
        telefone.setText(a.getTelefone());
        cpf.setText(a.getCpf());
        return view;
    }
}
