package com.cholis.movielist.model

import com.cholis.movielist.R

data class Movie(
    val id: Int,
    val judul: String,
    val sinopsis: String,
    val genre: String,
    val foto: Int,
    val sutradara: String,
    val fullSinopsis: String,
    var isFavorite: Boolean = false,
)

object DataMovie {
    val dummyMovie = listOf(
        Movie(
            id = 0,
            judul = "Forrest Gump (1994)",
            sinopsis = "Film ini mengikuti perjalanan hidup Forrest Gump (diperankan oleh Tom Hanks), seorang pria dengan kecerdasan di bawah rata-rata yang secara tidak sengaja menjadi saksi dan pelaku dalam beberapa peristiwa bersejarah Amerika.",
            genre = "Drama, Komedi, Romansa",
            foto = R.drawable.forrest_gump,
            sutradara = "Robert Zemeckis",
            fullSinopsis = "Forrest Gump adalah kisah luar biasa tentang seorang pria sederhana dengan kecerdasan di bawah rata-rata yang secara tak terduga terlibat dalam beberapa peristiwa bersejarah Amerika. Melalui mata Forrest Gump (diperankan oleh Tom Hanks), kita menyaksikan perjalanan hidup yang luar biasa, dari masa kecilnya yang sulit hingga karier militer, bisnis ping-pong, dan cinta sejatinya. Film ini mengombinasikan komedi, drama, dan romansa dalam satu paket yang mengharukan, menghadirkan gambaran mendalam tentang kehidupan, nasib, dan hubungan manusia."
        ),
        Movie(
            id = 1,
            judul = "Gladiator (2000)",
            sinopsis = "Film ini mengisahkan tentang jenderal Romawi Maximus (diperankan oleh Russell Crowe) yang jatuh dalam kehancuran dan kemudian menjadi seorang gladiator yang berjuang untuk membalas dendam.",
            genre = "Action, Drama, Sejarah",
            foto = R.drawable.gladiator,
            sutradara = "Ridley Scott",
            fullSinopsis = "Gladiator adalah epik sejarah yang mengisahkan kisah jenderal Romawi Maximus (diperankan oleh Russell Crowe) yang jatuh dalam kehancuran dan kemudian bangkit sebagai seorang gladiator yang berjuang untuk membalas dendam atas pembunuhan keluarganya. Dalam dunia yang penuh intrik politik dan pertempuran yang mematikan, Maximus berjuang untuk melakukan pembalasan yang spektakuler. Sutradara Ridley Scott menghadirkan lanskap Romawi yang megah, pertempuran yang epik, dan karakter-karakter yang kompleks."
        ),
        Movie(
            id = 2,
            judul = "Inception (2010)",
            sinopsis = "Seorang pencuri berkepala dingin, Dom Cobb (diperankan oleh Leonardo DiCaprio), menggunakan teknologi yang memungkinkannya memasuki mimpi orang lain untuk mencuri rahasia dari dalam pikiran mereka.",
            genre = "Sci-Fi, Action, Thriller",
            foto = R.drawable.inception,
            sutradara = "Christopher Nolan",
            fullSinopsis = "Inception mengajak penonton masuk ke dalam dunia yang menggabungkan teknologi canggih dengan imajinasi tak terbatas. Dom Cobb (diperankan oleh Leonardo DiCaprio) adalah seorang pencuri berkepala dingin yang memiliki kemampuan istimewa untuk memasuki mimpi orang lain dan mencuri rahasia dari dalam alam bawah sadar mereka. Dalam perjalanan pencurian pikiran ini, Cobb harus menghadapi konflik internal dan berbagai risiko psikologis yang mengancam keberadaannya. Ditampilkan dengan pengarahan visual yang mengagumkan."
        ),
        Movie(
            id = 3,
            judul = "Interstellar (2014)",
            sinopsis = "Sebuah tim penjelajah luar angkasa yang dipimpin oleh Cooper (diperankan oleh Matthew McConaughey) melakukan perjalanan melalui lubang cacing untuk mencari planet baru yang dapat dihuni oleh manusia. Film ini menggabungkan ilmu pengetahuan dan emosi dengan indah.",
            genre = "Sci-Fi, Drama",
            foto = R.drawable.interstellar,
            sutradara = "Christopher Nolan",
            fullSinopsis = "Interstellar adalah perjalanan epik yang memadukan ilmu pengetahuan dan emosi dalam sebuah kisah yang memukau. Dipimpin oleh Cooper (diperankan oleh Matthew McConaughey), sekelompok penjelajah luar angkasa melakukan perjalanan melalui lubang cacing untuk mencari planet baru yang dapat dihuni oleh manusia, menghadapi tantangan fisik dan psikologis yang luar biasa di sepanjang jalan. Dengan efek visual yang luar biasa dan narasi yang mendalam, film ini mengajukan pertanyaan tentang cinta, keberanian, dan masa depan umat manusia di luar bumi."
        ),
        Movie(
            id = 4,
            judul = "Pulp Fiction (1994)",
            sinopsis = "Film ini menggabungkan berbagai cerita dan karakter yang saling terkait dalam dunia kejahatan Los Angeles. Dikenal dengan dialog tajam dan penggambaran karakter yang kuat.",
            genre = "Kejahatan, Komedi, Drama",
            foto = R.drawable.pulp_fiction,
            sutradara = "Quentin Tarantino",
            fullSinopsis = "Pulp Fiction adalah potret yang berani dan tak terlupakan tentang kehidupan kejahatan dan moralitas yang ambigu di kota Los Angeles. Quentin Tarantino menggabungkan berbagai cerita dan karakter yang saling terkait dalam narasi yang penuh dengan dialog tajam dan penggambaran karakter yang kuat. Dengan twist yang tak terduga, film ini menjelajahi tema seperti keberuntungan, kehidupan dan kematian, serta cinta dan pengkhianatan. \"Pulp Fiction\" bukan hanya sebuah film, tetapi juga sebuah pengalaman yang memikat yang telah meraih status ikonik dalam dunia perfilman."
        ),
        Movie(
            id = 5,
            judul = "The Dark Knight (2008)",
            sinopsis = "Batman (diperankan oleh Christian Bale) berhadapan dengan penjahat psikopat Joker (diperankan oleh Heath Ledger) dalam salah satu konflik paling ikonik dalam sejarah film superhero.",
            genre = "Action, Superhero, Drama",
            foto = R.drawable.the_dark_knight,
            sutradara = "Christopher Nolan",
            fullSinopsis = "The Dark Knight adalah salah satu film superhero yang paling memukau dan memikat sepanjang masa. Batman (diperankan oleh Christian Bale) harus menghadapi penjahat psikopat Joker (diperankan oleh Heath Ledger) dalam konflik epik yang menguji moralitas dan batasan kepahlawanan. Christopher Nolan menghadirkan Gotham City yang gelap dan penuh ketegangan, dengan pertanyaan moral yang mendalam tentang kebaikan, kejahatan, dan bagaimana seorang pahlawan dapat mempertahankan integritasnya dalam dunia yang semakin terkoyak."
        ),
        Movie(
            id = 6,
            judul = "The Grand Budapest Hotel (2014)",
            sinopsis = "Film ini mengisahkan petualangan seorang kepala perhotelan eksentrik di sebuah hotel mewah di Eropa Timur dan kisah-kisah yang melibatkan tamu dan stafnya. Dikemas dengan gaya visual yang unik dan dialog lucu.",
            genre = "Komedi, Drama",
            foto = R.drawable.the_grand_budapest_hotel,
            sutradara = "Wes Anderson",
            fullSinopsis = "The Grand Budapest Hotel mengisahkan petualangan yang penuh warna dan ceria di sebuah hotel mewah di Eropa Timur. Film ini mengikuti kepala perhotelan eksentrik, M. Gustave (diperankan oleh Ralph Fiennes), dan sejumlah cerita unik yang melibatkan tamu dan staf hotel. Dikemas dengan gaya visual yang khas dari sutradara Wes Anderson, film ini memadukan humor kering, dialog lucu, dan karakter-karakter aneh yang menghiasi layar dengan cerita yang unik. \"The Grand Budapest Hotel\" adalah pengalaman yang menghibur dan menggugah tawa yang tak terlupakan dalam dunia perfilman modern."
        ),
        Movie(
            id = 7,
            judul = "The Lord of the Rings: The Fellowship of the Ring (2001)",
            sinopsis = "Seorang hobbit bernama Frodo (diperankan oleh Elijah Wood) harus membawa cincin kejahatan yang kuat ke gunung berapi Mordor untuk menghentikan kekuatan jahat Sauron. Ini adalah awal dari trilogi epik The Lord of the Rings.",
            genre = "Fantasi, Petualangan",
            foto = R.drawable.the_lord_of_the_ring,
            sutradara = "Peter Jackson",
            fullSinopsis = "The Lord of the Rings: The Fellowship of the Ring memulai trilogi epik yang tak tertandingi. Film ini mengisahkan perjalanan seorang hobbit bernama Frodo (diperankan oleh Elijah Wood) yang dipercayakan tugas untuk membawa cincin kejahatan yang kuat ke gunung berapi Mordor untuk menghentikan kekuatan jahat Sauron. Frodo dibantu oleh sekelompok pahlawan yang tergabung dalam The Fellowship of the Ring. Mereka harus menghadapi bahaya, makhluk-makhluk mengerikan, dan godaan kekuatan cincin yang korup."
        ),
        Movie(
            id = 8,
            judul = "The Matrix (1999)",
            sinopsis = "Seorang hacker bernama Neo (diperankan oleh Keanu Reeves) mengetahui bahwa dunia nyata yang dia kenal hanyalah simulasi komputer yang dikuasai oleh mesin. Dia bergabung dengan kelompok pemberontak untuk melawan mesin tersebut.",
            genre = "Sci-Fi, Action",
            foto = R.drawable.the_matrix,
            sutradara = "The Wachowskis",
            fullSinopsis = "The Matrix menghadirkan dunia yang mengacaukan pikiran dan menggugah imajinasi. Seorang hacker bernama Neo (diperankan oleh Keanu Reeves) mengetahui bahwa dunia yang dia kenal hanyalah simulasi komputer yang dikuasai oleh mesin cerdas. Dia bergabung dengan kelompok pemberontak yang dipimpin oleh Morpheus (diperankan oleh Laurence Fishburne) untuk melawan mesin tersebut dan memahami arti sejati dari kebebasan dan realitas. Dengan aksi luar biasa dan konsep filosofis yang dalam, \"The Matrix\" memicu perdebatan tentang kenyataan dan illusi dalam dunia teknologi modern."
        ),
        Movie(
            id = 9,
            judul = "The Shawshank Redemption (1994)",
            sinopsis = "Film ini mengisahkan tentang persahabatan yang tumbuh di penjara antara Andy Dufresne (diperankan oleh Tim Robbins) dan Red (diperankan oleh Morgan Freeman) seiring dengan usaha mereka untuk mencari keadilan dan kebebasan.",
            genre = "Drama, Kejahatan",
            foto = R.drawable.the_shawshank_redemption,
            sutradara = "Frank Darabont",
            fullSinopsis = "The Shawshank Redemption adalah sebuah kisah yang memilukan tentang kekuatan persahabatan dan tekad manusia untuk mencari keadilan dalam situasi yang penuh ketidakadilan. Andy Dufresne (diperankan oleh Tim Robbins) adalah seorang narapidana yang salah dihukum untuk pembunuhan yang tidak pernah dia lakukan. Di dalam penjara Shawshank, dia membentuk ikatan kuat dengan Red (diperankan oleh Morgan Freeman), seorang narapidana yang telah lama berada di dalamnya. Bersama-sama, mereka berjuang melawan sistem yang korup dan mencoba mencapai kebebasan mereka."
        )
    )
}
