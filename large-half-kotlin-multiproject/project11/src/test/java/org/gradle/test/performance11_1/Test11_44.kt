package org.gradle.test.performance11_1

import org.junit.Assert.*

class Test11_44 {
    private val production = Production11_44("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}