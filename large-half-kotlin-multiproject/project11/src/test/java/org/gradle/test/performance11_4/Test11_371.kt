package org.gradle.test.performance11_4

import org.junit.Assert.*

class Test11_371 {
    private val production = Production11_371("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}