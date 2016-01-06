
#வேர்ச்சொல் 

இசுகாலா (Scala) வில் எழுதிய இந்த API (திட்டம்)யானது ஒரு சொல்லில் இருக்கும் வேர்ச்சொல்லை பிரித்தெடுகும். இது தொடக்க நிலையில் இருக்கும் திட்டம். இசுகாலா நிரலாக்க மொழி அல்லது இயல்மொழி ஆய்வியல் (Natural Language Processing and Linguistics)போன்றவற்றில் ஆர்வமுடையோர் இதில் பங்களிக்க அல்ல  வழிகாட்ட இயலும். 

##உதாரணங்கள் 

   	வாழ்துகள் -> வாழ்து 
	மரங்கள் -> மரம் 
	சொற்கள் -> சொல் 

##சொல் எவ்வாறு மாற்றம் பெறுகிறது ?

**படிமுறை**

ஒரு சொல் மெய் எழுத்தோடு முடிகிறதா என்று பார்ப்பது 
	
ஆம் எனில் 

	அச்சொலில் இருக்கும் முதல் மெய் எழுத்து வரை பிரித்து வரும் சொல் -> வேர்ச்சொல்
	
இல்லை எனில் 

	வேர்ச்சொல் பிரிக்க இயலாத சொல்


உள்ளீடு    |  வெளியீடு  |  இடைநிலை  | முற்றுநிலை 
---------|---------- |-----------|----------
வாழ்துகள் |வாழ்து | வாழ்  | 
மரங்கள்| மரம்    | மரங்  |  மரம் (ங் -> ம்)
சொற்கள் | சொல் | சொற் |  சொல் (ல் -> ற்)

மேற்கண்ட சொற்களில்  ஒரு மெய்யெழுத்து மற்றொரு மெய்யெழுத்தாக மாற்றம் பெற்றுள்ளது (ங் -> ம்). 
எவ்வெழுத்து எவ்வாறாக மாற வேண்டும் என்பதை நிரல் மூலமாக செய்வதே இத்திட்டத்தின் நோக்கம். 



இந்த திட்டம் GitHub இல் வெளியிட்டுள்ளேன் 
***https://github.com/prassee/vaerCholScala***