package org.gradle.test.performance30_2

import org.junit.Assert.*

class Test30_126 {
    private val production = Production30_126("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}