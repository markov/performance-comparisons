package org.gradle.test.performance11_3

import org.junit.Assert.*

class Test11_276 {
    private val production = Production11_276("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}