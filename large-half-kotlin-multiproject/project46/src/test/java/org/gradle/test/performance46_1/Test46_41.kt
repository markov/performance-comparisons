package org.gradle.test.performance46_1

import org.junit.Assert.*

class Test46_41 {
    private val production = Production46_41("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
