package com.example.nabila.nabila_1202150253_modul3;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by NABILA on 24/02/2018.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private ArrayList<String> tvJudul, tvSubjudul;
    private ArrayList<Integer> Lgambar;

    public RecyclerViewAdapter(ArrayList<String> judulMinuman, ArrayList<String> subJudul, ArrayList<Integer> gambar) {

        tvJudul = judulMinuman;
        tvSubjudul = subJudul;
        Lgambar = gambar;
    }
    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView judul;
        public TextView subjudul;
        public ImageView imggambar;
        private RelativeLayout itemList;

        private Context context;

        public ViewHolder(View view) {
            super(view);

            context = itemView.getContext();
            judul = (TextView) view.findViewById(R.id.judul);
            subjudul = (TextView) view.findViewById(R.id.subjudul);
            imggambar = (ImageView) view.findViewById(R.id.imgList);
            itemList = view.findViewById(R.id.list);

            itemList.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, DetailActivity.class);
                    String deskripsi = "";
                    switch (getAdapterPosition()) {
                        case 0:
                            intent.putExtra("judul", tvJudul.get(getAdapterPosition()));
                            intent.putExtra("logo", Lgambar.get(getAdapterPosition()));
                            deskripsi = "Aqua adalah sebuah merek air minum dalam kemasan (AMDK) " +
                                    "yang diproduksi oleh PT Aqua Golden Mississippi Tbk di Indonesia sejak tahun 1973";
                            intent.putExtra("deskripsi", deskripsi);
                            context.startActivity(intent);
                            break;

                        case 1:
                            intent.putExtra("judul", tvJudul.get(getAdapterPosition()));
                            intent.putExtra("logo", Lgambar.get(getAdapterPosition()));
                            deskripsi = "Ades (sebelumnya pernah disebut AdeS) adalah merek air mineral atau air minum " +
                                    "dalam kemasan (AMDK) yang diproduksi oleh PT. Coca-Cola Bottling Indonesia, Bekasi";
                            intent.putExtra("deskripsi", deskripsi);
                            context.startActivity(intent);
                            break;

                        case 2:
                            intent.putExtra("judul", tvJudul.get(getAdapterPosition()));
                            intent.putExtra("logo", Lgambar.get(getAdapterPosition()));
                            deskripsi = "AMIDIS adalah produk Air Minum Dalam Kemasan (AMDK) yang sudah diproduksi sejak tahun 1997 " +
                                    "dan merupakan air minum distilasi pertama di Indonesia yang telah menjadi salah satu produk AMDK " +
                                    "yang dipercaya karena kualitas mutu dan kemurniannya";
                            intent.putExtra("deskripsi", deskripsi);
                            context.startActivity(intent);
                            break;

                        case 3:
                            intent.putExtra("judul", tvJudul.get(getAdapterPosition()));
                            intent.putExtra("logo", Lgambar.get(getAdapterPosition()));
                            deskripsi = " Air Murni Cleo diambil dari mata air pegunungan dan diproses melalui hyper membrane filter 0,0001 " +
                                    "mikron sehingga tidak mengandung mikroorganisme dan mineral anorganik, misalnya chlorine dan natrium fluoride.";
                            intent.putExtra("deskripsi", deskripsi);
                            context.startActivity(intent);
                            break;

                        case 4:
                            intent.putExtra("judul", tvJudul.get(getAdapterPosition()));
                            intent.putExtra("logo", Lgambar.get(getAdapterPosition()));
                            deskripsi = "Club adalah merek air minum dalam kemasan atau air mineral " +
                                    "di Indonesia. Merek ini berasal dari Surabaya dan Pandaan, Pasuruan, Jawa Timur.";
                            intent.putExtra("deskripsi", deskripsi);
                            context.startActivity(intent);
                            break;

                        case 5:
                            intent.putExtra("judul", tvJudul.get(getAdapterPosition()));
                            intent.putExtra("logo", Lgambar.get(getAdapterPosition()));
                            deskripsi = "Equil adalah air mineral anorganik yang di produksi oleh PT" +
                                    " Equilindo Asri. Sedang pemilik PT Equilindo Asri adalah Morgen Sutanto";
                            intent.putExtra("deskripsi", deskripsi);
                            context.startActivity(intent);
                            break;

                        case 6:
                            intent.putExtra("judul", tvJudul.get(getAdapterPosition()));
                            intent.putExtra("logo", Lgambar.get(getAdapterPosition()));
                            deskripsi = "Evian (pengucapan bahasa Perancis: [evjɑ̃ ]) adalah sebuah merek air" +
                                    " mineral Perancis yang berasal dari berbagai sumber dekat Évian-les-Bains, di pesisir selatan Lac Léman";
                            intent.putExtra("deskripsi", deskripsi);
                            context.startActivity(intent);
                            break;

                        case 7:
                            intent.putExtra("judul", tvJudul.get(getAdapterPosition()));
                            intent.putExtra("logo", Lgambar.get(getAdapterPosition()));
                            deskripsi = "Le Minerale adalah air mineral baru dari Mayora, berupa air mineral pegunungan yang mengandung mineral alami " +
                                    "yang dibutuhkan tubuh sehari-hari. Le Minerale, diolah dari sumber mata air pegunungan terpilih, " +
                                    "sehingga memiliki kesegaran khas yang ditandai dengan sedikit rasa manis";
                            intent.putExtra("deskripsi", deskripsi);
                            context.startActivity(intent);
                            break;

                        case 8:
                            intent.putExtra("judul", tvJudul.get(getAdapterPosition()));
                            intent.putExtra("logo", Lgambar.get(getAdapterPosition()));
                            deskripsi = "Nestlé Pure Life Mineral Water yang berasal dari segala kemurnian mata air pilihan dan diproses secara higienis.";
                            intent.putExtra("deskripsi", deskripsi);
                            context.startActivity(intent);
                            break;

                        case 9:
                            intent.putExtra("judul", tvJudul.get(getAdapterPosition()));
                            intent.putExtra("logo", Lgambar.get(getAdapterPosition()));
                            deskripsi = "PRISTINE bukan Air Mineral biasa karena PRISTINE bukan hanya sekedar menghilangkan dahaga, tapi juga bermanfaat bagi kesehatan. " +
                                    "Dengan proses Ionisasi, suatu prosess dimana memisahkan air dan mineral menjadi ion molekul yang lebih kecil";
                            intent.putExtra("deskripsi", deskripsi);
                            context.startActivity(intent);
                            break;

                        case 10:
                            intent.putExtra("judul", tvJudul.get(getAdapterPosition()));
                            intent.putExtra("logo", Lgambar.get(getAdapterPosition()));
                            deskripsi = "VIT adalah sebuah merek air minum dalam kemasan (AMDK) yang diproduksi oleh PT Tirta" +
                                    " Investama di Indonesia. Mulai diproduksi sejak tanggal 16 November 1982 dan awalnya dimiliki oleh PT Varia Industri Tirta";
                            intent.putExtra("deskripsi", deskripsi);
                            context.startActivity(intent);
                            break;
                    }
                }
            });
        }
}

    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }
    @Override
    public void onBindViewHolder(RecyclerViewAdapter.ViewHolder holder, int position){
        final String menu = tvJudul.get(position);
        final String harga = tvSubjudul.get(position);
        final Integer a = Lgambar.get(position);
        holder.judul.setText(menu);
        holder.subjudul.setText(harga);
        holder.imggambar.setImageResource(a);
    }
    @Override
    public int getItemCount(){
        return tvJudul.size();
    }
}

