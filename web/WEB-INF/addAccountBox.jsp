<%-- 
    Document   : AddAccountBox
    Created on : 10-Feb-2022, 13:25:10
    Author     : pupil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="w-100 d-flex justify-content-center">
    <form action="createAccountBox method=POST">
    <div class="card border-primary mb-3" style="width: 30em;">
        <h2 class="my-5">Сохранить данные для адресса</h2>
        <div class="form-group">
            <label for="url" class="form-label mt-4">url</label>
            <input type="text" class="form-control" id="url" name="url" aria-describedby="">
            <small id="url" hidden class="form-text text-muted">Error</small>
        </div>
        
        <div class="form-group">
            <label for="urlLogin" class="form-label mt-4">Логин</label>
            <input type="text" class="form-control" id="url" name="url" aria-describedby="">
            <small id="url" hidden class="form-text text-muted">Error</small>
        </div>
        
        <div class="form-group">
            <label for="urlLogin" class="form-label mt-4">Логин</label>
            <input type="text" class="form-control" id="url" name="url" aria-describedby="">
            <small id="url" hidden class="form-text text-muted">Error</small>
        </div>
        
        <div class="form-group">
            <label for="urlLogin" class="form-label mt-4">Пароль</label>
            <input type="text" class="form-control" id="url" name="url" aria-describedby="">
            <small id="url" hidden class="form-text text-muted">Error</small>
        </div>
    </form>
    </div>