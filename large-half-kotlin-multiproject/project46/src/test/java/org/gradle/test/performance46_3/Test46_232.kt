package org.gradle.test.performance46_3

import org.junit.Assert.*

class Test46_232 {
    private val production = Production46_232("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
