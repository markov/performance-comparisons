package org.gradle.test.performance11_3

import org.junit.Assert.*

class Test11_205 {
    private val production = Production11_205("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}