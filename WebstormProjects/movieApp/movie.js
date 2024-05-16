
// https://image.tmdb.org/t/p/w500/1E5baAaEse26fej7uHcjOgEE2t2.jpg
const API_KEY = "api_key=e07a872631e2c7eae6c584ad455ce75b"
const API_URL = "https://api.themoviedb.org/3";
const imageUrl = "https://image.tmdb.org/t/p/w500"
const SEARCH_URL = `${API_URL}/search/movie?${API_KEY}`;
const MOVIE_URL = `${API_URL}/movie/popular?${API_KEY}`;
console.log(MOVIE_URL);

const getMovies = (url) => {
    fetch(url)
        .then((response)=> response.json())
        .then((data) => {
            console.log(data.results);
            showMovies(data.results);
        })

        .catch((error) => console.log(error))

}

getMovies(MOVIE_URL);

const movieContainer = document.querySelector(".movieContainer");

const showMovies = (movies) => {
    movieContainer.innerHTML = "";
    console.log(movies)
    movies.forEach(movie => {
        const {title, overview, poster_path, vote_average} = movie;
        console.log(movie);
        const divTag = document.createElement('div');
        divTag.classList.add("movieDetails");
        divTag.innerHTML = `            
       <img src="${imageUrl}${poster_path}" alt="">
            <div class ="movieTitle">

                <p>${title}</p>
                <p>${vote_average}</p>
                <p>rating:7.9</p>
                

            </div>
            <h2>Overview</h2>
             <p>${overview}</p>
`;
        movieContainer.appendChild(divTag);
    });

}
const form = document.querySelector(".search")
    const search = document.querySelector("#searchInput");

    form.addEventListener("keyup",(e) => {
        e.preventDefault();
        const searchValue = search.value;
        if(searchValue) {
            getMovies(SEARCH_URL + "&query=" + searchValue);
        }else {
            getMovies(API_URL);
        }
    });




