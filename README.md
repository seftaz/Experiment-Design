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

### گزارش آزمایش
#### در ابتدا، فایل‌های ساختار کلی پروژه را (که توسط دیگر عضو گروه ساخته شدند) از گیت clone کرده، سپس تنظیمات مربوط به maven را اضافه کرده و پروژه را به روز می‌کنم.
<img width="1363" alt="image" src="https://github.com/seftaz/Experiment-Design/assets/79265096/f4e535c3-4ee4-4f77-9c80-48eda0283a52">

#### حال باید تست‌های مروبطه (در فایل MainTest) نوشته شده، و با خطا مواجه شوند. ابتدا توابع خالی را در Main می‌نویسیم و بعد تست برای آن‌ها را شروع می‌کنیم.

#### توابع خالی که در ادامه قصد استفاده از آن‌ها را داریم:
<img width="626" alt="image" src="https://github.com/seftaz/Experiment-Design/assets/79265096/b9361a7a-edd3-42a5-9fdd-82524509dead">

#### فایل Main که به صورت کلی از توابع استفاده کرده:
<img width="654" alt="image" src="https://github.com/seftaz/Experiment-Design/assets/79265096/fad6a3d3-258a-46dc-b45f-be884fe24057">

#### حال باید تست مربوط به هر متود را طراحی کنیم

#### شبیه‌سازی ورودی‌ها و تست توابع:
<img width="700" alt="image" src="https://github.com/seftaz/Experiment-Design/assets/79265096/05481db4-a0b4-413c-b329-d24332f8065f">
<img width="707" alt="image" src="https://github.com/seftaz/Experiment-Design/assets/79265096/205e31c2-6e04-4204-8cc2-d78a70621fd4">

#### همانطور که مشاهده می‌شود، تست‌ها همگی شکست می‌خورند:
<img width="1431" alt="image" src="https://github.com/seftaz/Experiment-Design/assets/79265096/13eab294-3956-495d-9273-6c53eca304b2">

#### حال، باید بدنه‌ی Main پیاده‌سازی شود:
<img width="701" alt="image" src="https://github.com/seftaz/Experiment-Design/assets/79265096/907a4fa2-2490-4986-bdac-a780747473f4">

#### بدین ترتیب مشاهده می‌شود که همه‌ی تست‌ها با موفقیت ران می‌شوند:
<img width="1431" alt="image" src="https://github.com/seftaz/Experiment-Design/assets/79265096/50269f8b-480b-4513-9f12-e5ad559d88d5">

#### در نهایت، کارکرد کد به صورتی دستی نیز تست می‌شود:
<img width="1431" alt="image" src="https://github.com/seftaz/Experiment-Design/assets/79265096/73eeeb3a-a403-4e73-aa73-b1e235f78304">

