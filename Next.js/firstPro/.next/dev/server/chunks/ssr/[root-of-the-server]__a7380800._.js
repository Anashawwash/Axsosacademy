module.exports = [
"[externals]/next/dist/shared/lib/no-fallback-error.external.js [external] (next/dist/shared/lib/no-fallback-error.external.js, cjs)", ((__turbopack_context__, module, exports) => {

const mod = __turbopack_context__.x("next/dist/shared/lib/no-fallback-error.external.js", () => require("next/dist/shared/lib/no-fallback-error.external.js"));

module.exports = mod;
}),
"[project]/Desktop/learning/Axsosacademy/Next.js/firstPro/app/page.jsx [app-rsc] (ecmascript)", ((__turbopack_context__) => {
"use strict";

__turbopack_context__.s([
    "default",
    ()=>__TURBOPACK__default__export__
]);
var __TURBOPACK__imported__module__$5b$project$5d2f$Desktop$2f$learning$2f$Axsosacademy$2f$Next$2e$js$2f$firstPro$2f$node_modules$2f$next$2f$dist$2f$server$2f$route$2d$modules$2f$app$2d$page$2f$vendored$2f$rsc$2f$react$2d$jsx$2d$dev$2d$runtime$2e$js__$5b$app$2d$rsc$5d$__$28$ecmascript$29$__ = __turbopack_context__.i("[project]/Desktop/learning/Axsosacademy/Next.js/firstPro/node_modules/next/dist/server/route-modules/app-page/vendored/rsc/react-jsx-dev-runtime.js [app-rsc] (ecmascript)");
var __TURBOPACK__imported__module__$5b$externals$5d2f$express__$5b$external$5d$__$28$express$2c$__cjs$2c$__$5b$project$5d2f$node_modules$2f$express$29$__ = __turbopack_context__.i("[externals]/express [external] (express, cjs, [project]/node_modules/express)");
var __TURBOPACK__imported__module__$5b$project$5d2f$Desktop$2f$learning$2f$Axsosacademy$2f$Next$2e$js$2f$firstPro$2f$node_modules$2f$next$2f$dist$2f$server$2f$route$2d$modules$2f$app$2d$page$2f$vendored$2f$rsc$2f$react$2e$js__$5b$app$2d$rsc$5d$__$28$ecmascript$29$__ = __turbopack_context__.i("[project]/Desktop/learning/Axsosacademy/Next.js/firstPro/node_modules/next/dist/server/route-modules/app-page/vendored/rsc/react.js [app-rsc] (ecmascript)");
;
;
;
function Header({ title }) {
    return /*#__PURE__*/ (0, __TURBOPACK__imported__module__$5b$project$5d2f$Desktop$2f$learning$2f$Axsosacademy$2f$Next$2e$js$2f$firstPro$2f$node_modules$2f$next$2f$dist$2f$server$2f$route$2d$modules$2f$app$2d$page$2f$vendored$2f$rsc$2f$react$2d$jsx$2d$dev$2d$runtime$2e$js__$5b$app$2d$rsc$5d$__$28$ecmascript$29$__["jsxDEV"])("h1", {
        children: title ? title : 'Default title'
    }, void 0, false, {
        fileName: "[project]/Desktop/learning/Axsosacademy/Next.js/firstPro/app/page.jsx",
        lineNumber: 5,
        columnNumber: 10
    }, this);
}
function HomePage() {
    const names = [
        'Ada Lovelace',
        'Grace Hopper',
        'Margaret Hamilton'
    ];
    const [likes, setLikes] = (0, __TURBOPACK__imported__module__$5b$project$5d2f$Desktop$2f$learning$2f$Axsosacademy$2f$Next$2e$js$2f$firstPro$2f$node_modules$2f$next$2f$dist$2f$server$2f$route$2d$modules$2f$app$2d$page$2f$vendored$2f$rsc$2f$react$2e$js__$5b$app$2d$rsc$5d$__$28$ecmascript$29$__["useState"])(0);
    function handleClick() {
        setLikes(likes + 1);
    }
    return /*#__PURE__*/ (0, __TURBOPACK__imported__module__$5b$project$5d2f$Desktop$2f$learning$2f$Axsosacademy$2f$Next$2e$js$2f$firstPro$2f$node_modules$2f$next$2f$dist$2f$server$2f$route$2d$modules$2f$app$2d$page$2f$vendored$2f$rsc$2f$react$2d$jsx$2d$dev$2d$runtime$2e$js__$5b$app$2d$rsc$5d$__$28$ecmascript$29$__["jsxDEV"])("div", {
        children: [
            /*#__PURE__*/ (0, __TURBOPACK__imported__module__$5b$project$5d2f$Desktop$2f$learning$2f$Axsosacademy$2f$Next$2e$js$2f$firstPro$2f$node_modules$2f$next$2f$dist$2f$server$2f$route$2d$modules$2f$app$2d$page$2f$vendored$2f$rsc$2f$react$2d$jsx$2d$dev$2d$runtime$2e$js__$5b$app$2d$rsc$5d$__$28$ecmascript$29$__["jsxDEV"])(Header, {
                title: "Develop. Preview. Ship."
            }, void 0, false, {
                fileName: "[project]/Desktop/learning/Axsosacademy/Next.js/firstPro/app/page.jsx",
                lineNumber: 19,
                columnNumber: 7
            }, this),
            /*#__PURE__*/ (0, __TURBOPACK__imported__module__$5b$project$5d2f$Desktop$2f$learning$2f$Axsosacademy$2f$Next$2e$js$2f$firstPro$2f$node_modules$2f$next$2f$dist$2f$server$2f$route$2d$modules$2f$app$2d$page$2f$vendored$2f$rsc$2f$react$2d$jsx$2d$dev$2d$runtime$2e$js__$5b$app$2d$rsc$5d$__$28$ecmascript$29$__["jsxDEV"])("ul", {
                children: names.map((name)=>/*#__PURE__*/ (0, __TURBOPACK__imported__module__$5b$project$5d2f$Desktop$2f$learning$2f$Axsosacademy$2f$Next$2e$js$2f$firstPro$2f$node_modules$2f$next$2f$dist$2f$server$2f$route$2d$modules$2f$app$2d$page$2f$vendored$2f$rsc$2f$react$2d$jsx$2d$dev$2d$runtime$2e$js__$5b$app$2d$rsc$5d$__$28$ecmascript$29$__["jsxDEV"])("li", {
                        children: name
                    }, name, false, {
                        fileName: "[project]/Desktop/learning/Axsosacademy/Next.js/firstPro/app/page.jsx",
                        lineNumber: 22,
                        columnNumber: 11
                    }, this))
            }, void 0, false, {
                fileName: "[project]/Desktop/learning/Axsosacademy/Next.js/firstPro/app/page.jsx",
                lineNumber: 20,
                columnNumber: 7
            }, this),
            /*#__PURE__*/ (0, __TURBOPACK__imported__module__$5b$project$5d2f$Desktop$2f$learning$2f$Axsosacademy$2f$Next$2e$js$2f$firstPro$2f$node_modules$2f$next$2f$dist$2f$server$2f$route$2d$modules$2f$app$2d$page$2f$vendored$2f$rsc$2f$react$2d$jsx$2d$dev$2d$runtime$2e$js__$5b$app$2d$rsc$5d$__$28$ecmascript$29$__["jsxDEV"])("button", {
                onClick: handleClick,
                children: [
                    "Like (",
                    likes,
                    ")"
                ]
            }, void 0, true, {
                fileName: "[project]/Desktop/learning/Axsosacademy/Next.js/firstPro/app/page.jsx",
                lineNumber: 26,
                columnNumber: 7
            }, this)
        ]
    }, void 0, true, {
        fileName: "[project]/Desktop/learning/Axsosacademy/Next.js/firstPro/app/page.jsx",
        lineNumber: 18,
        columnNumber: 5
    }, this);
}
const __TURBOPACK__default__export__ = HomePage;
}),
"[project]/Desktop/learning/Axsosacademy/Next.js/firstPro/app/page.jsx [app-rsc] (ecmascript, Next.js Server Component)", ((__turbopack_context__) => {

__turbopack_context__.n(__turbopack_context__.i("[project]/Desktop/learning/Axsosacademy/Next.js/firstPro/app/page.jsx [app-rsc] (ecmascript)"));
}),
];

//# sourceMappingURL=%5Broot-of-the-server%5D__a7380800._.js.map