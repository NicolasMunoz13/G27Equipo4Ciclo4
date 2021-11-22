import { Component, OnInit } from '@angular/core';


export interface RouteInfo {
    path: string;
    title: string;
    icon: string;
    class: string;
}

export const ROUTES: RouteInfo[] = [
    { path: '/dashboard',     title: 'Bienvenido',        icon:'nc-bank',                class: '' },
    { path: '/login',         title: 'Inicio de Sesion',  icon:'nc-single-02',           class: '' },
    { path: '/productos',     title: 'Productos',         icon:'nc-book-bookmark',       class: '' },
    { path:'/clientes',       title:'Clientes',           icon: 'nc-single-02',          class: ''},
    { path: '/notifications', title: 'Notifications',     icon:'nc-bell-55',             class: '' },
    { path: '/user',          title: 'User Profile',      icon:'nc-single-02',           class: '' },
    { path: '/table',         title: 'Table List',        icon:'nc-tile-56',             class: '' },
    { path: '/typography',    title: 'Typography',        icon:'nc-caps-small',          class: '' },
    { path: '/upgrade',       title: 'Upgrade to PRO',    icon:'nc-spaceship',           class: 'active-pro' },
];

@Component({
    moduleId: module.id,
    selector: 'sidebar-cmp',
    templateUrl: 'sidebar.component.html',
})

export class SidebarComponent implements OnInit {
    public menuItems: any[];
    ngOnInit() {
        this.menuItems = ROUTES.filter(menuItem => menuItem);
    }
}
