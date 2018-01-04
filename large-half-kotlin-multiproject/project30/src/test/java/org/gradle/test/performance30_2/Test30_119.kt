package org.gradle.test.performance30_2

import org.junit.Assert.*

class Test30_119 {
    private val production = Production30_119("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}