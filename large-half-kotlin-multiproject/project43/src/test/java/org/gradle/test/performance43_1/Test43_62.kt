package org.gradle.test.performance43_1

import org.junit.Assert.*

class Test43_62 {
    private val production = Production43_62("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
