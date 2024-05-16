# پرسش ها:
## سوال اول:
### در کتاب GoF به سه الگوی طراحی Creational Pattern, Strcutural Pattern, Behavioral Pattern اشاره شده  است که در ادمه به بررسی آنهای میپردازیم.

### Cretional Pattern: این الگو یک هدف دارد و آن هم این است که در قرآیند ایجاد اشیا این ایجاد شدن از کد کلابنت مستقل بوده و آز انها جدا باشد.
### Structural Pattern: این الگو برای ترکیب کردن کلاس ها و اشیا برای بدست آوردن ساختار های بزرگتر و پیجیده در یک سیستم استفاده میشود.
### Behavioral pPattern: این الگو  برای مدیریت کردن بر الگئریتم های بین اشیا و روابط و مسئولیت هاییشان است که چه رفتاری باید در یک سیستم از خودشان نشان دهند.

## سوال دوم:
### با توجه به اینکه هر دو الگوی های مورد استفاده در این سوال که Strategy و State نام دارند. در حال توصیف رفتار اشیار و در حال محدودت گذاشتن و زراحی نوی ارتباط و رفتار اشیار در کد هستند پس هر دو مربوط به دسته behavioral هستند.
## سوال سوم:
### احتمالا با توجه به اینکه تنها یک بسته در هر اجرا داریم پس به الگویی که در آن یک کلاس داریم که تنهای یک شی از آن کلاس وجود دارد میتوانیم نیاز داشته باشیم واین مورد میتوان در همان الگو طراحی Singletopn پیدا شود که به خوساته تک شی بودن بسته ما نتیجه شود.
## سوال چهارم:
### در اینجا به بررسی الگو خود در اصول مختلف میپردازیم:
### Single Responsibility : این مورد میتوان گفت در این الگوی طراحی ممکن است نقض شود زیرا علاوه بر وظیقه اصلی که کمنرل کردن ایجاد درست و یکدانه ای شی است. وظیقه مدیریت حالت آن این نیز با این الگو است.
### OCP: این الگو این اصل را به طور کامل رعایت میکند به این علت که واضحا بر روی تغییرات بسته است ولی بر روی تویعه ادند و پیشرفت کردن این  مورد به هیچ عنوان بسته نیست بلکه باز هم هست..
### Liskov Substitiution: این الگو تنها در یک صورت ممکن است این اصل را نقض کند. آن هم این حالت است که ابتدا از وراثت اسفتاده گردد و علاوه بر آن زیر کلاس ها جایگزین نشوند.
### ISP: به  این علت که این الگوی طراحی به طور معمول نیازی به پیاده سازی چندین رابطه ای ندارد پس این الگو  به طور عمومی و اکثر اوقات قضیه را رعایت میکند.
### DIP:ممکن است چون وابستگی های ما به طور مستقیم و بی واسطه به خود کلاس این الگو اشاره دارد پس میتوان گفت که این الگو به طو کلی میتواند این اصل را نقض کند.
