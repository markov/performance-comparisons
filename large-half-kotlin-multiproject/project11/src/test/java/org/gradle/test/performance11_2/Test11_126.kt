package org.gradle.test.performance11_2

import org.junit.Assert.*

class Test11_126 {
    private val production = Production11_126("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}