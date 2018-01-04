package org.gradle.test.performance43_2

import org.junit.Assert.*

class Test43_170 {
    private val production = Production43_170("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
