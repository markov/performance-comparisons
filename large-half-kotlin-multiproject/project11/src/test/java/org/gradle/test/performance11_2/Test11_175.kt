package org.gradle.test.performance11_2

import org.junit.Assert.*

class Test11_175 {
    private val production = Production11_175("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}