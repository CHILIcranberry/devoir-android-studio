public class MonAdaptateurDeListe extends ArrayAdapter<String> {

    private Integer[] tab_images_pour_la_liste = {
            R.drawable.device, R.drawable.zoom-buggy,
            R.drawable.zoom-doof-wagon,
            R.drawable.zoom-fdk,
            R.drawable.zoom-interceptor,
            R.drawable.zoom-mack,
            R.drawable.zoom-mad-grandma,
            R.drawable.zoom-mad-pickup,
            R.drawable.zoom-peacemaker,
            R.drawable.zoom-people-eater,
            R.drawable.zoom-plymouth-rock,
            R.drawable.zoom-the-big-foot,
            R.drawable.zoom-the-gigahorse,
            R.drawable.zoom-the-nux-car,
            R.drawable.zoom-the-war,
            R.drawable.zoom-you-shall-not-pass
    };

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)
                getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.rowlayout, parent, false);

        TextView textView = (TextView) rowView.findViewById(R.id.label);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);

        textView.setText(getItem(position));

        if(convertView == null )
            imageView.setImageResource(tab_images_pour_la_liste[position]);
        else
            rowView = (View)convertView;

        return rowView;
    }

    public MonAdaptateurDeListe(Context context, String[] values) {
        super(context, R.layout.rowlayout, values);
    }
}