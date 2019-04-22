package com.example.mypc.bd64districtinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    private ImageView imageView;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        imageView = (ImageView) findViewById(R.id.imageViewId);
        textView = (TextView) findViewById(R.id.textViewId);

        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            String districtName = bundle.getString("name");
            showDetails(districtName);
        }
    }

    private void showDetails(String districtName) {
        if(districtName.equals("Dhaka")){
        imageView.setImageResource(R.drawable.dhaka);
            textView.setText(R.string.dhaka_text);
    }
    if(districtName.equals("Gazipur")){
        imageView.setImageResource(R.drawable.gazipur);
            textView.setText(R.string.gazipur_text);
    }
    if(districtName.equals("Gopalganj")){
        imageView.setImageResource(R.drawable.gopalganj);
            textView.setText(R.string.gopalganj_text);
    }
    if(districtName.equals("Kishoreganj")){
        imageView.setImageResource(R.drawable.kishoreganj);
            textView.setText(R.string.kishoreganj_text);
    }
    if(districtName.equals("Manikganj")){
        imageView.setImageResource(R.drawable.manikganj);
            textView.setText(R.string.manikganj_text);
    }
    if(districtName.equals("Munshiganj")){
        imageView.setImageResource(R.drawable.munsigonj);
            textView.setText(R.string.munshiganj_text);
    }
    if(districtName.equals("Narayanganj")){
            imageView.setImageResource(R.drawable.naryanganj);
            textView.setText(R.string.narayanganj_text);
        }
    if(districtName.equals("Faridpur")){
            imageView.setImageResource(R.drawable.faridpur);
            textView.setText(R.string.faridpur_text);
        }
        if(districtName.equals("Madaripur")){
            imageView.setImageResource(R.drawable.madaripur);
            textView.setText(R.string.madaripur_text);
        }
        if(districtName.equals("Shariyatpur")){
            imageView.setImageResource(R.drawable.shariatpur);
            textView.setText(R.string.shariyatpur_text);
        }
        if(districtName.equals("Tangail")){
            imageView.setImageResource(R.drawable.tangail);
            textView.setText(R.string.tangail_text);
        }
        if(districtName.equals("Narshindi")){
            imageView.setImageResource(R.drawable.narsingdi);
            textView.setText(R.string.narshindi_text);
        }
        if(districtName.equals("Rajbari")){
            imageView.setImageResource(R.drawable.rajbari);
            textView.setText(R.string.rajbari_text);
        }
        if(districtName.equals("1")){
        imageView.setImageResource(R.drawable.brahmanbaria);
            textView.setText(R.string.brahmanbaria_text);
    } if(districtName.equals("2")){
        imageView.setImageResource(R.drawable.comilla);
            textView.setText(R.string.comilla_text);
    } if(districtName.equals("3")){
        imageView.setImageResource(R.drawable.lakshmipur);
            textView.setText(R.string.laxmipur_text);
    } if(districtName.equals("4")){
        imageView.setImageResource(R.drawable.chandpur);
            textView.setText(R.string.chadpur_text);
    } if(districtName.equals("5")){
        imageView.setImageResource(R.drawable.noakhali);
            textView.setText(R.string.noakhali_text);
    } if(districtName.equals("6")){
        imageView.setImageResource(R.drawable.feni);
            textView.setText(R.string.feni_text);
    } if(districtName.equals("7")){
        imageView.setImageResource(R.drawable.chittagong);
            textView.setText(R.string.chittagong_text);
    } if(districtName.equals("8")){
        imageView.setImageResource(R.drawable.coxsbazar);
            textView.setText(R.string.coxsbazar_text);
    }if(districtName.equals("9")){
        imageView.setImageResource(R.drawable.rangamati);
            textView.setText(R.string.rangamati_text);
    }if(districtName.equals("10")){
        imageView.setImageResource(R.drawable.khagrachari);
            textView.setText(R.string.khagrachari_text);
    }if(districtName.equals("11")){
        imageView.setImageResource(R.drawable.bandarban);
            textView.setText(R.string.bandarban_text);
    }
        if(districtName.equals("12")){
            imageView.setImageResource(R.drawable.khulna);
            textView.setText(R.string.khulna_text);
        }
        if(districtName.equals("13")){
            imageView.setImageResource(R.drawable.bagerhat);
            textView.setText(R.string.bagerhat_text);
        }
        if(districtName.equals("14")){
            imageView.setImageResource(R.drawable.narail);
            textView.setText(R.string.narail_text);
        }
        if(districtName.equals("15")){
            imageView.setImageResource(R.drawable.chuadanga);
            textView.setText(R.string.chuadanga_text);
        }
        if(districtName.equals("16")){
            imageView.setImageResource(R.drawable.kushtia);
            textView.setText(R.string.kushtia_text);
        }
        if(districtName.equals("17")){
            imageView.setImageResource(R.drawable.jhenaidah);
            textView.setText(R.string.jhenaidah_text);
        }
        if(districtName.equals("18")){
            imageView.setImageResource(R.drawable.magura);
            textView.setText(R.string.magura_text);
        }
        if(districtName.equals("19")){
            imageView.setImageResource(R.drawable.meherpur);
            textView.setText(R.string.meherpur_text);
        }
        if(districtName.equals("20")){
            imageView.setImageResource(R.drawable.jessore);
            textView.setText(R.string.jessore_text);
        }
        if(districtName.equals("21")){
            imageView.setImageResource(R.drawable.satkhira);
            textView.setText(R.string.satkhira_text);
        }
        if(districtName.equals("22")){
            imageView.setImageResource(R.drawable.habiganj);
            textView.setText(R.string.hobiganj__text);
        }
        if(districtName.equals("23")){
            imageView.setImageResource(R.drawable.sunamganj);
            textView.setText(R.string.sunamganj__text);
        }
        if(districtName.equals("24")){
            imageView.setImageResource(R.drawable.moulvibazar);
            textView.setText(R.string.mulvibazar__text);
        }
        if(districtName.equals("25")){
            imageView.setImageResource(R.drawable.sylhet);
            textView.setText(R.string.sylhet_text);
        }
        if(districtName.equals("26")){
            imageView.setImageResource(R.drawable.jamalpur);
            textView.setText(R.string.jamalpurtwo_text);
        }
        if(districtName.equals("27")){
            imageView.setImageResource(R.drawable.netrokona);
            textView.setText(R.string.netrokona_text);
        }
        if(districtName.equals("28")){
            imageView.setImageResource(R.drawable.mymensingh);
            textView.setText(R.string.mymensingh_text);
        }
        if(districtName.equals("29")){
            imageView.setImageResource(R.drawable.sherpur);
            textView.setText(R.string.sherpur_text);
        }
        if(districtName.equals("30")){
            imageView.setImageResource(R.drawable.chapainababganj);
            textView.setText(R.string.chapainababganj_text);
        }
        if(districtName.equals("31")){
            imageView.setImageResource(R.drawable.joypurhat);
            textView.setText(R.string.joypurhat_text);
        }
        if(districtName.equals("32")){
            imageView.setImageResource(R.drawable.naogaon);
            textView.setText(R.string.naogaon_text);
        }
        if(districtName.equals("33")){
            imageView.setImageResource(R.drawable.natore);
            textView.setText(R.string.natore_text);
        }
        if(districtName.equals("34")){
            imageView.setImageResource(R.drawable.pabna);
            textView.setText(R.string.pabna_text);
        }
        if(districtName.equals("35")){
            imageView.setImageResource(R.drawable.bogra);
            textView.setText(R.string.bagura_text);
        }
        if(districtName.equals("36")){
            imageView.setImageResource(R.drawable.rajshahi);
            textView.setText(R.string.rajshahi_text);
        }
        if(districtName.equals("37")){
            imageView.setImageResource(R.drawable.sirajganj);
            textView.setText(R.string.shirajganj_text);
        }
        if(districtName.equals("38")){
            imageView.setImageResource(R.drawable.jhalokati);
            textView.setText(R.string.jhalokathi_text);
        }
        if(districtName.equals("39")){
            imageView.setImageResource(R.drawable.patuakhali);
            textView.setText(R.string.patuakhali_text);
        }
        if(districtName.equals("40")){
            imageView.setImageResource(R.drawable.pirojpur);
            textView.setText(R.string.pirojpur_text);
        }
        if(districtName.equals("41")){
            imageView.setImageResource(R.drawable.barguna);
            textView.setText(R.string.barguna_text);
        }
        if(districtName.equals("42")){
            imageView.setImageResource(R.drawable.barisal);
            textView.setText(R.string.barishal_text);
        }
        if(districtName.equals("43")){
            imageView.setImageResource(R.drawable.bhola);
            textView.setText(R.string.bhola_text);
        }
        if(districtName.equals("44")){
            imageView.setImageResource(R.drawable.kurigram);
            textView.setText(R.string.kurigram_text);
        }
        if(districtName.equals("45")){
            imageView.setImageResource(R.drawable.gaibandha);
            textView.setText(R.string.gaibandha_text);
        }
        if(districtName.equals("46")){
            imageView.setImageResource(R.drawable.thakurgaon);
            textView.setText(R.string.thakurgaon_text);
        }
        if(districtName.equals("47")){
            imageView.setImageResource(R.drawable.dinajpur);
            textView.setText(R.string.dinajpur_text);
        }
        if(districtName.equals("48")){
            imageView.setImageResource(R.drawable.nilphamari);
            textView.setText(R.string.nilphamari_text);
        }
        if(districtName.equals("49")){
            imageView.setImageResource(R.drawable.panchagarh);
            textView.setText(R.string.panchagarh_text);
        }
        if(districtName.equals("50")){
            imageView.setImageResource(R.drawable.rangpur);
            textView.setText(R.string.rangpur_text);
        }
        if(districtName.equals("51")){
            imageView.setImageResource(R.drawable.lalmonirhat);
            textView.setText(R.string.lalmonirhat_text);
        }
    }
}
