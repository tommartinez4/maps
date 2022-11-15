package com.cdp.svmaps;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.cdp.svmaps.databinding.ActivityMapSvBinding;

public class MapSv extends FragmentActivity implements OnMapReadyCallback,GoogleMap.OnMarkerClickListener {

    private GoogleMap mMap;
    private ActivityMapSvBinding binding;
    private Marker markerPrue,markerPrue1,markerPrue2,markerPrue3,markerPrue4,markerPrue5,markerPrueL1,
            markerPrueL2,markerPrueL3,markerPrueL4,markerPrueL5,markerPrueL6,markerPrueL7,markerPrueL8,
            markerPrueL9,markerPrueL10,markerPrueL11,markerPrueL12,markerPrueL13,markerPrueL14,markerPrueL15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapSvBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng salvador = new LatLng(13.8000382, -88.9140683);
        mMap.addMarker(new MarkerOptions().position(salvador).draggable(true).title("El Salvador").icon(BitmapDescriptorFactory.fromResource(R.drawable.es)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(salvador,10));

        //volcanes
        //Santa Ana
        LatLng VSanta = new LatLng(13.848337422627452,-89.62891660716018);
        markerPrue = googleMap.addMarker(new MarkerOptions().position(VSanta).title("volcan Santa Ana").icon(BitmapDescriptorFactory.fromResource(R.drawable.volcan)));

        // Izalco
        LatLng VIzal = new LatLng(13.811565824366355,-89.63205806882178);
        markerPrue1 = googleMap.addMarker(new MarkerOptions().position(VIzal).title("volcan Izalco").icon(BitmapDescriptorFactory.fromResource(R.drawable.volcan)));

        // San Salvador
        LatLng VSs = new LatLng(13.73553069452349,-89.28627251292575);
        markerPrue2 = googleMap.addMarker(new MarkerOptions().position(VSs).title("volcan San Salvador").icon(BitmapDescriptorFactory.fromResource(R.drawable.volcan)));

        //San Vicente
        LatLng VSv = new LatLng(13.59632570587496,-88.83815022016422);
        markerPrue3 = googleMap.addMarker(new MarkerOptions().position(VSv).title("volcan San Vicente").icon(BitmapDescriptorFactory.fromResource(R.drawable.volcan)));

        //San Miguel
        LatLng VSm = new LatLng(13.430419880967548,-88.27113762325045);
        markerPrue4 = googleMap.addMarker(new MarkerOptions().position(VSm).title("volcan San Miguel").icon(BitmapDescriptorFactory.fromResource(R.drawable.volcan)));

        //Usulutan
        LatLng VUs = new LatLng(13.417205043174803,-88.46868702341378);
        markerPrue5 = googleMap.addMarker(new MarkerOptions().position(VUs).title("volcan Usulutan").icon(BitmapDescriptorFactory.fromResource(R.drawable.volcan)));


        //lagos
        //coatepeque
        LatLng Lcoa = new LatLng(13.862887142939158,-89.54716287208669);
        markerPrueL1 = googleMap.addMarker(new MarkerOptions().position(Lcoa).title("Lago de Coatepeque").icon(BitmapDescriptorFactory.fromResource(R.drawable.lago)));
        //Güija
        LatLng Loui = new LatLng(14.26704938873307,-89.52393120167507);
        markerPrueL2 = googleMap.addMarker(new MarkerOptions().position(Loui).title("Lago de Güija").icon(BitmapDescriptorFactory.fromResource(R.drawable.lago)));
        //Ilopango
        LatLng LPan = new LatLng(13.66632754626383,-89.04362775801158);
        markerPrueL3 = googleMap.addMarker(new MarkerOptions().position(LPan).title("Lago de Ilopango").icon(BitmapDescriptorFactory.fromResource(R.drawable.lago)));
        //suchitoto
        LatLng LSc = new LatLng(14.037756269874649,-89.05087234290598);
        markerPrueL4 = googleMap.addMarker(new MarkerOptions().position(LSc).title("Lago de Suchitoto").icon(BitmapDescriptorFactory.fromResource(R.drawable.lago)));
        //olomega
        LatLng LOlo = new LatLng(13.309803515972504,-88.06118507391761);
        markerPrueL5 = googleMap.addMarker(new MarkerOptions().position(LOlo).title("Lago de Olomega").icon(BitmapDescriptorFactory.fromResource(R.drawable.lago)));
        //Jocotal
        LatLng Ljoco = new LatLng(13.33201081884961,-88.2507090503984);
        markerPrueL6 = googleMap.addMarker(new MarkerOptions().position(Ljoco).title("Laguna el Jocotal").icon(BitmapDescriptorFactory.fromResource(R.drawable.lago)));
        googleMap.setOnMarkerClickListener(this);

        //playas
        LatLng Playa1 = new LatLng(13.492552,-89.3828622);
        markerPrueL7 = googleMap.addMarker(new MarkerOptions().position(Playa1).title("Playa el tunco").icon(BitmapDescriptorFactory.fromResource(R.drawable.vacaciones)));
        googleMap.setOnMarkerClickListener(this);
        LatLng Playa2 = new LatLng(13.5,-89.38333);
        markerPrueL8 = googleMap.addMarker(new MarkerOptions().position(Playa2).title("Playa el zunzal").icon(BitmapDescriptorFactory.fromResource(R.drawable.vacaciones)));
        googleMap.setOnMarkerClickListener(this);

        //pupusas
        LatLng Olocuilta = new LatLng(13.5664823,-89.116608);
        markerPrueL9 = googleMap.addMarker(new MarkerOptions().position(Olocuilta).title("Olocuilta").icon(BitmapDescriptorFactory.fromResource(R.drawable.pupusas)));
        googleMap.setOnMarkerClickListener(this);
        LatLng planes = new LatLng(13.6440727,-89.1843934);
        markerPrueL10 = googleMap.addMarker(new MarkerOptions().position(planes).title("Los planes de renderos").icon(BitmapDescriptorFactory.fromResource(R.drawable.pupusas)));
        googleMap.setOnMarkerClickListener(this);

        //Centros comerciales
        //Plaza Mundo
        LatLng plaza = new LatLng(13.6986181,-89.1504561);
        markerPrueL11 = googleMap.addMarker(new MarkerOptions().position(plaza).title("Plaza Mundo").icon(BitmapDescriptorFactory.fromResource(R.drawable.cc)));
        googleMap.setOnMarkerClickListener(this);
        //Metro Centro
        LatLng centro = new LatLng(13.6995822,-89.1884939);
        markerPrueL12 = googleMap.addMarker(new MarkerOptions().position(centro).title("Metro Centro").icon(BitmapDescriptorFactory.fromResource(R.drawable.cc)));
        googleMap.setOnMarkerClickListener(this);
        //Galerias
        LatLng Gale = new LatLng(13.7031333,-89.2290927);
        markerPrueL13 = googleMap.addMarker(new MarkerOptions().position(Gale).title("Galerias escalon").icon(BitmapDescriptorFactory.fromResource(R.drawable.cc)));
        googleMap.setOnMarkerClickListener(this);
        //La gran via
        LatLng lagran = new LatLng(13.6777682,-89.2539381);
        markerPrueL14 = googleMap.addMarker(new MarkerOptions().position(lagran).title("La gran via").icon(BitmapDescriptorFactory.fromResource(R.drawable.cc)));
        googleMap.setOnMarkerClickListener(this);

        //amburguesa
        //Burger king
        LatLng Burger = new LatLng(13.7006353,-89.2140544);
        markerPrueL15 = googleMap.addMarker(new MarkerOptions().position(Burger).title("Burger king").icon(BitmapDescriptorFactory.fromResource(R.drawable.bk)));
        googleMap.setOnMarkerClickListener(this);

    }

    //metodo que muestra las coordenadas en un toast
    @Override
    public boolean onMarkerClick(@NonNull Marker marker) {
        String lat,lng;
        lat = Double.toString(markerPrue.getPosition().latitude);
        lng = Double.toString(markerPrue.getPosition().longitude);
        if (marker.equals(markerPrue)) {
            Toast.makeText(this,lat+","+lng,Toast.LENGTH_SHORT).show();

        }else if (marker.equals(markerPrue1)){
            Toast.makeText(this,lat+","+lng,Toast.LENGTH_SHORT).show();

        }else if (marker.equals(markerPrue2)){
            Toast.makeText(this,lat+","+lng,Toast.LENGTH_SHORT).show();

        }else if (marker.equals(markerPrue3)){
            Toast.makeText(this,lat+","+lng,Toast.LENGTH_SHORT).show();

        }else if (marker.equals(markerPrue4)){
            Toast.makeText(this,lat+","+lng,Toast.LENGTH_SHORT).show();

        }else if (marker.equals(markerPrueL1)){
            Toast.makeText(this,lat+","+lng,Toast.LENGTH_SHORT).show();

        }else if (marker.equals(markerPrueL2)){
            Toast.makeText(this,lat+","+lng,Toast.LENGTH_SHORT).show();

        }else if (marker.equals(markerPrueL3)){
            Toast.makeText(this,lat+","+lng,Toast.LENGTH_SHORT).show();

        }else if (marker.equals(markerPrueL4)){
            Toast.makeText(this,lat+","+lng,Toast.LENGTH_SHORT).show();

        }else if (marker.equals(markerPrueL5)){
            Toast.makeText(this,lat+","+lng,Toast.LENGTH_SHORT).show();

        }else if (marker.equals(markerPrueL6)){
            Toast.makeText(this,lat+","+lng,Toast.LENGTH_SHORT).show();

        }else if (marker.equals(markerPrueL7)){
            Toast.makeText(this,lat+","+lng,Toast.LENGTH_SHORT).show();

        }else if (marker.equals(markerPrueL8)){
            Toast.makeText(this,lat+","+lng,Toast.LENGTH_SHORT).show();

        }else if (marker.equals(markerPrueL9)){
            Toast.makeText(this,lat+","+lng,Toast.LENGTH_SHORT).show();

        }else if (marker.equals(markerPrueL10)){
            Toast.makeText(this,lat+","+lng,Toast.LENGTH_SHORT).show();

        }
        else if (marker.equals(markerPrueL11)){
            Toast.makeText(this,lat+","+lng,Toast.LENGTH_SHORT).show();

        }else if (marker.equals(markerPrueL12)){
            Toast.makeText(this,lat+","+lng,Toast.LENGTH_SHORT).show();

        }else if (marker.equals(markerPrueL13)){
            Toast.makeText(this,lat+","+lng,Toast.LENGTH_SHORT).show();

        }else if (marker.equals(markerPrueL14)){
            Toast.makeText(this,lat+","+lng,Toast.LENGTH_SHORT).show();

        }else if (marker.equals(markerPrueL15)){
            Toast.makeText(this,lat+","+lng,Toast.LENGTH_SHORT).show();

        }
        return false;
    }
}