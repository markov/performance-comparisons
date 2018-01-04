package org.gradle.test.performance7_2

import org.junit.Assert.*

class Test7_166 {
    private val production = Production7_166("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}