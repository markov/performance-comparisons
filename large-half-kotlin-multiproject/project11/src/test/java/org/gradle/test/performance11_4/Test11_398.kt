package org.gradle.test.performance11_4

import org.junit.Assert.*

class Test11_398 {
    private val production = Production11_398("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}