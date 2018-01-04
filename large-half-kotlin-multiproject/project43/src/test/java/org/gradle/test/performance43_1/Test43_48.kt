package org.gradle.test.performance43_1

import org.junit.Assert.*

class Test43_48 {
    private val production = Production43_48("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
