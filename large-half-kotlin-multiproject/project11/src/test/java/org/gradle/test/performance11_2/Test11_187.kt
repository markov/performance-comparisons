package org.gradle.test.performance11_2

import org.junit.Assert.*

class Test11_187 {
    private val production = Production11_187("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}