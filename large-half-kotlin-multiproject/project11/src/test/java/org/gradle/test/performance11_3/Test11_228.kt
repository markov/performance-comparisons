package org.gradle.test.performance11_3

import org.junit.Assert.*

class Test11_228 {
    private val production = Production11_228("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}