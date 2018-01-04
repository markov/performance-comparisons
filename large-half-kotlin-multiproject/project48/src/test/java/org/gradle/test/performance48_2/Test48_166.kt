package org.gradle.test.performance48_2

import org.junit.Assert.*

class Test48_166 {
    private val production = Production48_166("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
