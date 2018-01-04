package org.gradle.test.performance7_2

import org.junit.Assert.*

class Test7_119 {
    private val production = Production7_119("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}