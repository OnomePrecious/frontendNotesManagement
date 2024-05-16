const taskListOne = document.querySelector("#task-list ul ");
console.log(taskListOne);

taskListOne.addEventListener("click", (event) => {
    console.log(event);
    let classname = event.target.className;
    console.log(classname);
    if(Object.is(classname, "delete")){
        let li= event.target.parentElement;
        taskListOne.removeChild(li)
    }

})

const searchTask = document.forms["search-tasks"]
const listOfTasks= document.querySelectorAll("#task-list li .description")

searchTask.addEventListener("keyup", function (e){
    let inputText = e.target.value.toLowerCase()
    listOfTasks.forEach((task) => {
        let title = task.textContent.toLowerCase()
        let isInclude =title.includes(inputText)
        let parentNode = task.parentNode
        console.log(parentNode)
        if(isInclude){
            parentNode.style.display = "block"
        } else {
            parentNode.style.display = "none"
        }

    })

})

const addTask = document.forms["add-Task"]
console.log(addTask);
addTask.addEventListener("submit",  (e) =>{
    e.preventDefault()
    const inputValue = addTask.querySelector("input").value.toString() ;
    if(inputValue.trim().length > 0 && /\w/.test(inputValue[e])) {
        const LiTag = document.createElement("li");
        const spanOne = document.createElement("span");
        const spanTwo = document.createElement("span");
        const spanThree = document.createElement("input");

        spanThree.type = "checkbox";
        spanOne.classList = "description";
        spanTwo.classList = 'delete'

        LiTag.appendChild(spanThree)
        LiTag.appendChild(spanOne);
        LiTag.appendChild(spanTwo);

        spanOne.textContent = inputValue;
        spanTwo.textContent = "delete";
        taskListOne.appendChild(LiTag);

        addTask.reset()
    }
});