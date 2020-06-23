package pt.ipg.vizinhoamigo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class VizinhosAdapter extends RecyclerView.Adapter<VizinhosAdapter.ViewHolder> {

    private  int resource;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(ViewGroup.getContext()).inflate(resource,ViewGrou  false);
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class  ViewHolder extends RecyclerView.ViewHolder{

        private TextView textViewVIzinho;
        public View view;

        public  ViewHolder(View view){
            super(view);

            this.view = view;
            this.textViewVIzinho = (TextView) view.findViewById(R.id.rec_listavizinhos)
        }
    }
}
