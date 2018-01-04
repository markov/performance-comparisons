package org.gradle.test.performance11_2

import org.junit.Assert.*

class Test11_112 {
    private val production = Production11_112("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}