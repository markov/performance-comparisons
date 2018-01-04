package org.gradle.test.performance43_1

import org.junit.Assert.*

class Test43_51 {
    private val production = Production43_51("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
