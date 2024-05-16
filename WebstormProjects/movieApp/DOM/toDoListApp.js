const addTask = document.forms["addTask"];

addTask.addEventListener("submit", (e) => {
    e.preventDefault();
    const task = addTask.elements["task"].value;
    const taskList = document.querySelector(".taskList");
    const newTask = document.createElement("li");
    newTask.innerText = task;
    taskList.appendChild(newTask);
    addTask.elements["task"].value = "";
})
const displayTasks = (url) => {
    fetch(url)
        .then((response)=> response.json())
        .then((data) => {
            console.log(data.results);
            showMovies(data.results);
        })

        .catch((error) => console.log(error))

}




















const removeTask = document.querySelector(".taskList");

removeTask.addEventListener("click", (e) => {
    if(e.target.tagName === "delete") {
        e.target.remove();
        e.target.classList.remove("task");

    }


})