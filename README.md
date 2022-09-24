# Android_Add_2_Nums
Simple App to Take 2 numbers form user and add them

This topic is a part of [My Complete Andorid Course](https://github.com/ananddasani/Android_Apps)

# Code

#### 1st Activity 
```
Button addButton;
TextView putView;
EditText Number1, Number2;
    
int n1, n2, ans;

//list the items
addButton = findViewById(R.id.addButton);
putView = findViewById(R.id.putView);
Number1 = findViewById(R.id.Number1);
Number2 = findViewById(R.id.Number2);

        //add numbers when button is clicked
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //get the 2 number given by the user
                n1 = Integer.parseInt(Number1.getText().toString());
                n2 = Integer.parseInt(Number2.getText().toString());
                ans = n1 + n2;

                putView.setText(n1 + " + " + n2 + " = " + ans);
            }
        });
```

#App Highlight

![AddApp](https://user-images.githubusercontent.com/74413402/192092009-d2ab69a6-ffc5-4cd7-a358-6365a7069da2.jpg)

![AddCode](https://user-images.githubusercontent.com/74413402/192092066-599eb3af-b84e-46cb-9c73-2eb76ad2092c.jpg)
